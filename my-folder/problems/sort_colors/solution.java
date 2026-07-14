class Solution {
    public void sortColors(int[] nums) 
    {  
        //this is the dnf alg
        //the optimal soln is in notes 
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swapInArray(nums, low, mid);
                low++;
                mid++;
            }

            else if(nums[mid] == 1)
            {
                mid++;
            }

            else
            {
                swapInArray(nums, high, mid);
                high--;
            }
        }
        
    }

    public static void swapInArray(int[] arr, int index1, int index2) 
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}