class Solution {
    public void reverse(int maxih[]){
        int i = 0 , j = maxih.length-1;

        while(i < j){
            int temp = maxih[i];
            maxih[i] = maxih[j];
            maxih[j] = temp;

            i++;
            j--;
        }
    }

    public long maximumTotalSum(int[] maxih) {
        int n = maxih.length;
        long sum = 0;

        Arrays.sort(maxih);
        reverse(maxih);

        for(int i =1 ; i < n ; i++){
            if(maxih[i] == maxih[i-1]){
                if(maxih[i] == 1) return -1;
                else{
                    maxih[i] = maxih[i] -1;
                }
            }

            else if(maxih[i] > maxih[i-1]){
                if(maxih[i-1] == 1) return -1;
                else{
                    maxih[i] = maxih[i-1] -1;
                }
            }
        }

        for(int a : maxih){
            sum += a;
        } 

        return sum;
    }
}