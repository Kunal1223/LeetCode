//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(M>N)
        return -1;
        
        int start=Integer.MIN_VALUE;
        int end=0;
        
        for(int i=0;i<N;i++){
            if(A[i]>start)
            start=A[i];
            end+=A[i];
        }
        
        
        int ans=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int num=verify(A,mid);
            if(num>M){
                start=mid+1;
            }else
            end=mid-1;
        }
        
        return start;
    }
    
    
    static int verify(int[] arr,int num){
      
      int count=0;
      int temp=0;
      int i=0;
      
      while(i<arr.length){
          if(temp+arr[i]<=num){
              temp+=arr[i];
              if(i==arr.length-1){
                  count++;
              }
              i++;
          }else{
              count++;
              temp=0;
          }
      }
      return count;
      
    }
    
    
};