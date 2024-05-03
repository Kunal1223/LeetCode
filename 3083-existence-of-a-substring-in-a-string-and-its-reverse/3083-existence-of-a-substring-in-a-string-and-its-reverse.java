class Solution {
    public boolean isSubstringPresent(String s) {
        String check = "";

        for(int i = 0 ; i < s.length()-1 ; i++){
            check = "";
            check += s.charAt(i+1);
            check += s.charAt(i);

            if(s.contains(check)){
                return true;
            }
        }

        return false;
    }
}