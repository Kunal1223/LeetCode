class Solution {
    public int numEquivDominoPairs(int[][] arr) {
        HashMap<String,Integer> hp = new HashMap<>();
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            String s1 = String.valueOf(arr[i][0])+String.valueOf(arr[i][1]);
            String s2 = String.valueOf(arr[i][1])+String.valueOf(arr[i][0]);
            if(hp.containsKey(s1)){
                ans = ans+hp.get(s1);
            }else if(hp.containsKey(s2)){
                ans = ans+hp.get(s2);
            }

            if(s1.equals(s2)) hp.put(s1,hp.getOrDefault(s1,0)+1);
            else{
                hp.put(s1,hp.getOrDefault(s1,0)+1);
                hp.put(s2,hp.getOrDefault(s2,0)+1);
            }
            
        }
        return ans;
    }
}