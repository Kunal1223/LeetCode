class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> -Integer.compare(a[1], b[1]));
        int boxsize = 0;

        for (int[] box : boxTypes) {
            if (truckSize <= 0) break;
            if (truckSize < box[0]) {
                boxsize += truckSize * box[1];
                truckSize = 0;
            } else {
                boxsize += box[0] * box[1];
                truckSize -= box[0];
            }
        }

        return boxsize;
    }
}