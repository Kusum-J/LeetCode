class Solution {
    public int characterReplacement(String s, int k) 
    {
        int ryt = 0, left = 0;
        int[] occ = new int[26];
        int maxOcc = 0;
        int ans = 0;

        for(ryt = 0; ryt < s.length(); ryt++)
        {
            maxOcc = Math.max(maxOcc, ++occ[s.charAt(ryt) - 'A']);

            if(ryt - left + 1 - maxOcc > k)
            {
                occ[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, ryt - left + 1);
        }

        return ans;
    }
}