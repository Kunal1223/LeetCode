class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int m = x;
        int y = 0;

        while(x > 0){
            int temp = x % 10;
            y = y * 10 + temp;
            x = x / 10;
        }

        if(m == y) return true;
        else return false;

    }
}