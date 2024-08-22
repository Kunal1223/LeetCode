class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        String newstr = "";

        for(char c : binary.toCharArray()){
            if(c == '0'){
                newstr += '1';
            }else{
                newstr += '0';
            }
        }

        return Integer.parseInt(newstr , 2);
    }
}