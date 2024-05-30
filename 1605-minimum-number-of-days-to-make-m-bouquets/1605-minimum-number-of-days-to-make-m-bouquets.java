class Solution {

    public int FindMin(int bloomDay[]){
        int min = 0;

        for(int a : bloomDay){
            min = Math.min(min , a);
        }

        return min;
    }

    public int FindMax(int bloomDay[]){
        int max = 0;

        for(int a : bloomDay){
            max = Math.max(max , a);
        }

        return max;
    }

    public int Possible(int bloomDay[] , int m , int k , int mid){
        int count = 0;
        int ans = 0;

        for(int i = 0 ; i < bloomDay.length ; i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                ans += count/k;
                count = 0;
            }
        }

        ans += count / k;
        return ans;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int ans = 0;
        int st = FindMin(bloomDay);
        int en = FindMax(bloomDay);

        if ((long) m * k >(long) bloomDay.length) {
            return -1;
        } else {
            while (st <= en) {
                int mid = st + (en - st) / 2;
                int make = Possible(bloomDay, m, k , mid);

                if (make >= m) {
                    ans = mid;
                    en = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }

        return ans;

    }
}