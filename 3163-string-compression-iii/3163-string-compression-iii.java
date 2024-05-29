class Solution {
    public String compressedString(String word) {
        int n = word.length();
        if (n == 0)
            return "";

        StringBuilder ans = new StringBuilder();
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                while (count > 9) {
                    ans.append(9).append(word.charAt(i));
                    count -= 9;
                }
                ans.append(count).append(word.charAt(i));
                count = 1;
            }
        }

        while (count > 9) {
            ans.append(9).append(word.charAt(n - 1));
            count -= 9;
        }
        ans.append(count).append(word.charAt(n - 1));

        return ans.toString();
    }
}