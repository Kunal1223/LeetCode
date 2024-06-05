class Solution {
    public int numberOfSpecialChars(String word) {
        int[] firstUpper = new int[26];  
        int[] lastLower = new int[26];  

        Arrays.fill(firstUpper , -1);
        Arrays.fill(lastLower , -1);


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                int index = ch - 'A';
                if (firstUpper[index] == -1) {
                    firstUpper[index] = i;
                }
            } else if (Character.isLowerCase(ch)) {
                int index = ch - 'a';
                lastLower[index] = i;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 && firstUpper[i] != -1 && lastLower[i] < firstUpper[i]) {
                count++;
            }
        }

        return count;
    }
}
