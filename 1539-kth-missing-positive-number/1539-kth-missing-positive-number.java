class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }

        int i = 1;
        while(k != 0){
            if(!list.contains(i)){
                k--;
            }
            i++;
        }

        return i-1;
    }
}