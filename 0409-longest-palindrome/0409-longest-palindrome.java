class Solution {
    public int longestPalindrome(String s) {
        
        char check[] = s.toCharArray();
        
        Arrays.sort(check);
        int count = 0;
        
        int length = check.length;
        
        if(length == 1){
            return 1;
        }
        
        for(int i = 0 ; i < length-1 ; i++){
            
            if(check[i] == check[i+1]){           
                count= count +2;
                i++;           
            }
                
        }
        
        
        
        if(count < length){
            count++;
        }
        
        return count;
        
    }
}