//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int getValue(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10; 
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){return 500;}
        if(c=='M'){return 1000;}
        return -1;
    }
    public int romanToDecimal(String str) {
        int result=0,n=str.length();
        for(int i=0;i<n;i++){
            int num1=getValue(str.charAt(i));
            if(i+1<=n-1){
                int num2=getValue(str.charAt(i+1));
                if(num1>=num2){
                    result+=num1;
                }else{
                    result+=num2-num1;
                    i++;
                }
            }
            else{
                result+=num1;
            }
        }
        return result;
    }
}