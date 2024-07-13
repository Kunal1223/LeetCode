class Solution {

    public Boolean isAllow(String s , String curr , int k){
        int j = 0 , target = 0;

        for(int i = 0 ; i < s.length() ; i++){    
            if(s.charAt(i) == curr.charAt(j)){
                j++;

                if(j == curr.length()){
                    target++;
                    j = 0;

                    if(target == k){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public String longestSubsequenceRepeatedK(String s, int k) {
        int n = 26;
        Queue<String> qu = new LinkedList<>();
        String ans = "";
        qu.add("");

        while(!qu.isEmpty()){
            int size = qu.size();
            
            while(size-- > 0){
                String prev = qu.poll();
                for(int i = 0 ; i < n ; i++){
                    String curr = prev + (char)('a'+ i);
                    if(isAllow(s , curr , k)){
                        qu.add(curr);
                        ans = curr;
                    }
                }
            }
        }

        return ans;
    }
}