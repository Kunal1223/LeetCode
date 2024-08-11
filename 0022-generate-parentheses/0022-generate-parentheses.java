class Solution {

    public void generate(List<String> list , int n , int left , int right , String s){
        if(s.length() == 2*n){
            list.add(s);
        }

        if(left < n){
            generate(list , n , left+1 , right , s+"(");
        }

        if(right < left){
            generate(list , n , left , right+1 , s+")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list , n , 0 , 0 , "");
        return list;
    }
}