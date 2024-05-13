//Problems of the day


// class Solution {
//     public int reverse(int x) {
//         int result = 0;
        
//         while (x != 0) {
//             int lastDigit = x % 10;
            
           
//             if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
//                 return 0;
//             }
//             if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
//                 return 0;
//             }
            
//             result = result * 10 + lastDigit;
//             x /= 10;
//         }

//         return result;
//     }
// }

class Solution {
    public int reverse(int x) {

        long ans = 0;
        while (x != 0) {
            int temp = x % 10;
            ans = ans * 10 + temp;
            x = x / 10;

            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ) {
                return 0;
            }
        }

        return (int)ans;

    }
}


