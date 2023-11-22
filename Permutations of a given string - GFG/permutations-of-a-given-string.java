//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    List<String> list = new ArrayList<String>();
    
    HashSet<String> set = new HashSet<String>();
    
    public List<String> find_permutation(String S) {
        // Code here
        int n = S.length();
        backTrack(S, 0, n-1);
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    public void backTrack(String S, int ind, int N){
        if(ind==N){
            set.add(S);
        }
        else{
            for(int i=ind;i<=N;i++){
                S = swap(S, ind, i);
                backTrack(S, ind+1, N);
                S = swap(S, ind, i);
            }
        }
    }
    
    public String swap(String S, int i, int j){
        char[] charArr = S.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        
        return String.valueOf(charArr);
    }
}