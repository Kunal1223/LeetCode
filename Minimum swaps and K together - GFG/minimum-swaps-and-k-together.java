//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int K = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.minSwap(arr, sizeOfArray, K);
		    System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java



class Complete{
    
  
    public static int minSwap (int arr[], int n, int k) {
        // finding the favarable window size
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] <= k){
                count++;
            }
        }
        
        // finding the non favarable window size
        int greaterThanK = 0;
        for(int i=0; i<count; i++){
            if(arr[i] > k){
                greaterThanK++;
            }
        }
        
        //required number to swap 
        int minSwapRequired = greaterThanK;
        
        int j = count;
        for(int i=0; j<n; i++){
            if(arr[i] > k){
                greaterThanK--;
            }
            
            if(arr[j] > k){
                greaterThanK++;
            }
             minSwapRequired = Math.min(minSwapRequired, greaterThanK);
            j++;
        }
        
        return minSwapRequired;
    }
    
    
}
