class Solution 
{
    int start = 0;
    int maxLen = 0;

    public String longestPalindrome(String s) 
    {
        if(s == null || s.length() == 0)
            return s;

        for(int i = 0 ; i < s.length(); i++)
        {
            expand(s, i, i); //odd
            expand(s, i, i+1);
        }

        return s.substring(start, start + maxLen);
    }

    private void expand(String s, int left, int ryt)
    {
        while(left >= 0 && ryt < s.length() && s.charAt(left) == s.charAt(ryt) )
        {
            left--;
            ryt++;
        }
        int len = ryt - left - 1;

        if(len > maxLen)
        {
            maxLen = len;
            start = left + 1;
        }
    }
}