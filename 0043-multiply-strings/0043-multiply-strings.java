class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n]; // Stores the product
        
        // Multiply each digit of num1 with each digit of num2
        for (int i = m - 1; i >= 0; i--) {
            int carry = 0;
            int digit1 = num1.charAt(i) - '0';
            
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = digit1 * digit2 + carry + result[i + j + 1];
                result[i + j + 1] = sum % 10; // Update the current digit
                carry = sum / 10; // Update the carry
            }
            result[i] += carry; // Update the next digit
        }
        
        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) { // Skip leading zeros
                sb.append(digit);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString(); // Return "0" if the result is empty
    }
}
