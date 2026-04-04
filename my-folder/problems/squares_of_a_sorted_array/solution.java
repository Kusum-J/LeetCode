class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int ryt = n - 1;
        int pos = n - 1;

        while(left <= ryt)
        {
            int leftSq = nums[left] * nums[left];
            int rytSq = nums[ryt] * nums[ryt];

            if(leftSq > rytSq)
            {
                //if the left sq is greater than the ryt sq then move it to the ryt side of the array because atp pos starts from the ryt side of the array
                result[pos] = leftSq;
                left++;
            }
            else
            {
                result[pos] = rytSq;
                ryt--;
            }

            pos--;
        }

        return result;
    }
}