class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int left = 0;
        int ryt = 0;
        int ans = 0;

        if(s.length() == 0 || s == null)
        {
            return 0;
        }
        if(s.length() == 1)
        {
            return 1;
        }

        HashSet<Character> set = new HashSet<>();

        while(ryt < s.length())
        {
            char c = s.charAt(ryt);
            while(set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, ryt - left + 1);
            ryt++;
        }

        return ans;





    }
}