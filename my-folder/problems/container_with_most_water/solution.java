class Solution {
    public int maxArea(int[] height) 
    {
        int left = 0;
        int ryt = height.length - 1;

        int maxArea = 0;
        int width;
        int length;

        while(left < ryt)
        {
            length = Math.min(height[left], height[ryt]);
            width = ryt - left;

            maxArea = Math.max(maxArea, width * length);

            if(height[left] < height[ryt])
                left++;

            else
                ryt--;
        }

        return maxArea;
    }
}