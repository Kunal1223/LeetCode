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
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<ArrayList<Integer>>b1=new ArrayList<>();
        for(int i=0;i<=n-4;i++){
            for(int j=i+1;j<=n-3;j++){
                int l=j+1;
                int r=n-1;
                while(l<r){
                    if(arr[i]+arr[j]+arr[l]+arr[r]==k){
                        ArrayList<Integer>b2=new ArrayList<>();
                        b2.add(arr[i]);
                        b2.add(arr[j]);
                        b2.add(arr[l]);
                        b2.add(arr[r]);
                        if(!b1.contains(b2)) b1.add(b2);
                        l++;
                        r--;
                    }else if(arr[i]+arr[j]+arr[l]+arr[r]<k){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
           
        }
         return b1;
    }
}