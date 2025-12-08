class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] ansArr = new int[2];

        for (int i = 0; i < nums.length; i++)
        {
            int num = target - nums[i];

            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[j] == num)
                {
                    ansArr[0] = i;
                    ansArr[1] = j;
                    return ansArr;
                }
            }
        }

        return ansArr;
    }
}
