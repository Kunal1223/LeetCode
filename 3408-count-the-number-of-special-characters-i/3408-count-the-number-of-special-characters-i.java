class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        int n = word.length() , count = 0;
        if(n == 0 || n == 1) return 0;

        for(int i = 0 ; i < n ; i++){
            char ch = word.charAt(i);

            if(Character.isUpperCase(ch)){
                char temp = Character.toLowerCase(ch);

                if(!set.contains(ch) && word.indexOf(temp) != -1){
                    set.add(ch);
                    count++;
                }
            }
        }

        return count;

        
    }
}