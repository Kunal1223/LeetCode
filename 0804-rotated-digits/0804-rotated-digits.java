class Solution {

    public String rotate(String str){
        String temp = "";
        boolean flag = true;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == '0' || ch == '8' || ch == '1'){
                temp += ch;
            }
            else if(ch == '2'){
                temp += '5';
            }
            else if(ch == '5'){
                temp += '2';
            }
            else if(ch == '6'){
                temp += '9';
            }
            else if(ch == '9'){
                temp += '6';
            }else{
                flag = false;
                break;
            }
        }

        if(flag == false){
            return "-1";
        }

        return temp;
    }

    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 0 ; i <= n ; i++){
            String str = Integer.toString(i);
            String check = rotate(str);

            if(!str.equals(check) && !check.equals("-1")){
                count++;
            }
        }

        return count;
    }
}