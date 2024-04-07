class Solution {
    public int numDecodings(String s) {
        
        if(s.charAt(0) == '0' ){
            return 0;
        }
        
        if(s.length() == 1){
            return 1;
        }
        
        int count1 = 1, count2= 1;
        for(int i = 1; i < s.length() ; i++){

            int count = 0;
            if(s.charAt(i) - '0' > 0)
                count += count2;
            
            int n = ((s.charAt(i-1)-'0') * 10 + s.charAt(i) - '0' );
            
            if( n >= 10 && n <= 26)
                count += count1;
            
            count1 = count2;
            count2 = count;
            
        }
        
        return count2;
        
    }
}