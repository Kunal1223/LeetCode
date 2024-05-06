class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int openCount = 0;
        
        // Forward pass: mark invalid closing parentheses and count open parentheses
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount == 0) {
                    chars[i] = '*'; // Mark invalid closing parenthesis
                } else {
                    openCount--;
                }
            }
        }
        
        // Backward pass: mark extra open parentheses
        for (int i = chars.length - 1; i >= 0 && openCount > 0; i--) {
            if (chars[i] == '(') {
                chars[i] = '*'; // Mark extra open parenthesis
                openCount--;
            }
        }
        
        // Construct result string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != '*') {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
