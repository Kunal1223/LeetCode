class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character , Integer> map = new HashMap<>();

        int n = s.length();
        int count = 0 , max = 0;
        int left = 0;

        for(int right = 0 ; right < n ; right++){
            char ch = s.charAt(right);

            map.put(ch , map.getOrDefault(ch , 0) + 1);

            while(map.get(ch) > 2){
                char ch1 = s.charAt(left);
                map.put(ch1 , map.get(ch1) - 1);

                if(map.get(ch1) == 0) map.remove(ch1);
                left++;
            }

            max = Math.max(max , right - left + 1);
        }

        return max;

    }
}