class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String , Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            String check = arr[i];
            map.put(check , map.getOrDefault(check , 0)+1);
        }

        for(int i = 0 ; i < n ; i++){
            String check = arr[i];

            if(map.get(check) == 1){
                k--;
            }

            if(k == 0){
                return check;
            }
        }

        
        return "";
    }
}