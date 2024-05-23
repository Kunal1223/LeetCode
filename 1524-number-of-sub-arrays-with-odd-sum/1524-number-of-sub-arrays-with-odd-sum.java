// class Solution {
//     public int numOfSubarrays(int[] arr) {
//         int n = arr.length;
//         int sum = 0 , count = 0;

//         for(int i = 0 ; i  < n ; i++){
//             sum  += arr[i];
//             if(sum % 2 != 0) count++;

//             for(int j = i+1 ; j < n ; j++){
//                 sum += arr[j];

//                 if(sum %2 != 0) count++;
//             }

//             sum = 0;
//         }

//         return count;
//     }
// }


class Solution {
    public int numOfSubarrays(int[] arr) {
        long ans = 0, odd = 0, even = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                long temp = even;
                even = odd;
                odd = temp;
                odd++;
            }
            ans += odd;
        }
        return (int)(ans % (Math.pow(10, 9) + 7));
    }
}