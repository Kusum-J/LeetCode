import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {  
            int flag = nums1[i];
            int max = -1; 

            for (int j = 0; j < nums2.length; j++) {  
                if (flag == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > flag) {
                            max = nums2[k];
                            break; 
                        }
                    }
                    break; 
                }
            }
            result[i] = max;
        }
        
        return result;
    }
}
