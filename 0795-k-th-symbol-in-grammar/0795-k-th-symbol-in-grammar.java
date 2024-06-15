class Solution {

    public int Solve(int n , int k){
        if(n == 1 && k == 1){
            return 0;
        }

        int mid = (int) Math.pow(2 , n-1)/2;

        if(k <= mid){
            return Solve(n-1 , k);
        }else{
            return 1-Solve(n-1 , k-mid);
        }
    }

    public int kthGrammar(int n, int k) {
        return Solve(n , k);
    }
}