class Solution {
    public int findNumbers(int[] nums) 
    {
        
        int countDigit = 0, evenCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            countDigit = 0;
            int number = nums[i];

            while(number != 0)
            {
                int digit = number % 10;
                countDigit++;
                number /= 10;
            }

            if(countDigit % 2 == 0)
                evenCount++;
        }

        return evenCount;
    }
}