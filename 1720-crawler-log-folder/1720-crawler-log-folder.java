class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        int count = 0;

        for(int i = 0 ; i < n ; i++){

            String check = logs[i];

            if(check.equals("./")) continue;

            else if(check.equals("../")){
                count--;

                if(count < 0) count = 0;
            }

            else count++;
        }

        return count;
    }
}