class Solution {
    public class kunal implements Comparator<Integer> {
       @Override
        public int compare(Integer a,Integer b) {
           String e = a+""+b;
           String f = b+""+a;
           return f.compareTo(e);
        }
    }
    
    public String largestNumber(int[] nums) {
        Integer[] a = new Integer[nums.length];

        for(int i = 0;i<nums.length;i++) a[i] = nums[i];
        Arrays.sort(a,new kunal());

        StringBuilder sb = new StringBuilder();
        for(int x : a) {
           sb.append(x);
        }

        String ans = sb.toString();
        int ind = 0;

        // return ans;

        for(ind = 0;ind<nums.length;ind++) {
            if(ans.charAt(ind) == '0') continue;
            else break;
        }
        
        return ans.substring(ind,ans.length()) == "" ? "0" : ans.substring(ind,ans.length());
    }
}