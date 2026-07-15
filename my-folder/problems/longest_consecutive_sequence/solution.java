import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;

        int longest = 1;
        HashSet<Integer> set = new HashSet<>();

        // Put all elements into the HashSet
        for (int i = 0; i < n; i++) 
        {
            set.add(nums[i]);
        }

        // Traverse the HashSet
        for (int it : set) 
        {

            // Check if 'it' is the start of a sequence
            if (!set.contains(it - 1)) 
            {

                int count = 1;
                int x = it;

                // Count consecutive numbers
                while (set.contains(x + 1)) 
                {
                    x++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}