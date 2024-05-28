class Solution {
    
    public List<Integer> generateRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        
        long ans = 1;
        list.add((int) ans);
        int index = rowIndex+1;
        
        for(int i = 1 ; i < index ; i++){         
            ans = ans * (index - i);
            ans = ans / i;
            list.add((int) ans);
        }
        
        return list;
        
    }
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0 ; i < numRows ; i++){
            res.add(new ArrayList(generateRow(i)));
        }
        
        return res;
        
    }
}