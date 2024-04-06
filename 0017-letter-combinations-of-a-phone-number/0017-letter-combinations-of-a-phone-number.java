class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if(digits.length() == 0)
            return list;

        String combination = "";
        String [] set  = {"", "" , "abc" , "def" , "ghi" ,"jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};

        allsets(combination , digits , list , set);

        return list;
        
    }

    public List<String> allsets(String combination , String digits , List<String> list , String []set){

        if(digits.isEmpty()){
            list.add(combination);
        }
        else{

        int number = digits.charAt(0) - '0';
        String letter = set[number];

        for(char character : letter.toCharArray()){
            allsets(combination+character , digits.substring(1) , list , set);
        }
        }

        return list;
    }
}