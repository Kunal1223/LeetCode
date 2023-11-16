//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList <Integer> list = new ArrayList<>();
        
        list.add(1);
        for( int fact = 2; fact <= N; fact++){
            int size = list.size();
            int carry = 0;
            
            for ( int i = 0; i < size; i++){
                int temp = list.get(i)*fact + carry; 
                list.set(i, temp%10);
                carry = temp / 10;
            }
            
            while (carry > 0){ 
                list.add(carry % 10);
                carry = carry/10;
            }
        }
        Collections.reverse(list);
        return list;
    }
}