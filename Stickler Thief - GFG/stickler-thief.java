//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        int a[] = new int[n+1];
        a[n] = Integer.MIN_VALUE;
        return fun(arr,n-1,a);
        // Your code here
    }
    public int fun(int arr[], int i, int a[]){
        if(i==0){
            return arr[i];
        }
        if(i<0){
            return 0;
        }
        if(a[i]!=0){
            return a[i];
        }
        
        int take = arr[i]+ fun(arr,i-2,a);
        int ntake = 0 + fun(arr,i-1,a);
        return a[i] = Math.max(take,ntake);
    }
}