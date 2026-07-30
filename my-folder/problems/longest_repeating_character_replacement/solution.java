class Solution {
    public int characterReplacement(String s, int k) 
    {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxWindow = 0;

        for(int ryt = 0; ryt < s.length(); ryt++)
        {
            freq[s.charAt(ryt) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(ryt) - 'A']);

            int windowSize = ryt - left + 1;

            if(windowSize - maxFreq > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowSize = ryt - left + 1;
            maxWindow = Math.max(maxWindow, windowSize);
        }

        return maxWindow;
    }
}