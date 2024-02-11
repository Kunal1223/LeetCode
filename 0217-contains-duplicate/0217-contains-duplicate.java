import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            } else {
                set.add(num); // Add the number to the set
            }
        }
        
        return false; // No duplicates found
    }
}
