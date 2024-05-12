class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = x;
        while(x > 0){
            int temp = x % 10;
            sum += temp;
            x = x / 10;
        }
        
        if(num % sum == 0){
            return sum;
        }

        return -1;
    }
}