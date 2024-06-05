class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        if (n == 0 ) return 0;
        if (n == 1 ) return 1;

        int res = 0 ,max = 0 ;
        int a[] = new int [26];
        int l = 0;

        for(int r = 0 ; r < n  ; r++){

            a[s.charAt(r) - 'A']++;

            max = Math.max(max , a[s.charAt(r) - 'A']);

            if(r-l+1 - max > k){
                a[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res , r - l +1);

        }

        return res;
    }
}