class Solution {

    public List<Integer> generaterow(int n){
        List<Integer> list = new ArrayList<>();

        int val = 1;
        list.add(val);

        for(int i = 1 ; i < n ; i++){
            val = val * (n-i);
            val = val / i;
            list.add(val);
        }

        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if(numRows == 0) return list;

        for(int i = 0; i < numRows ; i++){
            list.add(generaterow(i+1));
        }

        return list;
    }
}