class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int temp = 0;

        while( i >= 0 || j >= 0){

            int s1 = 0; int s2= 0;

            if(i >= 0){
                s1 = num1.charAt(i) - '0' ;
                i--;
            }

            if(j >= 0){
                s2 = num2.charAt(j) - '0' ;
                j--;
            }

            int sum = s1 + s2 + temp;
            
            if(sum > 9){
                temp = 1;
            }else{
                temp = 0;
            }

            sb.insert(0, sum%10);
        }

        if(temp == 1)
            sb.insert(0,temp);

        return sb.toString();
        
    }
}
