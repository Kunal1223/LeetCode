class Solution {

    public void Solve(int n, int ind, List<String> ans, String str) {
        
        if (ind == n) {
            ans.add(str);
            return;
        }

        if (ind == 0) {
            Solve(n, ind + 1, ans, str + '0');
            Solve(n, ind + 1, ans, str + '1');
        } else {
            if (str.charAt(ind - 1) == '0') {
                Solve(n, ind + 1, ans, str + '1');
            } else {
                Solve(n, ind + 1, ans, str + '0');
                Solve(n, ind + 1, ans, str + '1');
            }
        }
    }

    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        Solve(n, 0, ans, "");
        return ans;
    }
}
