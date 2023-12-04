//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        //Naive solutions
        //Use the merging process of the merge sort to merge two
        //arrays and then return the kth element
        int i=0,j=0,idx=0;
        int merged_arr[]=new int[n+m];
        
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                merged_arr[idx]=arr1[i];
                i++;
                idx++;
            }else{
                merged_arr[idx]=arr2[j];
                j++;
                idx++;
            }
        }
        while(i<n){
            merged_arr[idx]=arr1[i];
            i++;
            idx++;
        }
        while(j<m){
            merged_arr[idx]=arr2[j];
            j++;
            idx++;
        }
        return merged_arr[k-1];
    }
    //Now optimal solution
}