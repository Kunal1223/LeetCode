class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        
        Recursion(s , 0 , res , path);
        
        return res;
        
    }
    
    public void Recursion (String s , int index , List<List<String>> res , List<String> path){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
        }
        
        for(int i = index ; i < s.length() ;  i++){
            if(Palidrom(s , i , index)){
                path.add(s.substring(index , i+1));
                Recursion(s , i+1 , res , path);
                path.remove(path.size() - 1);
            }
        }  
    }
    
    public boolean Palidrom(String s , int end , int start){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        
        return true;
    }
    
    
}