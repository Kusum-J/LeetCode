class Solution {
    public boolean validPalindrome(String s) 
    {
        int left = 0;
        int ryt = s.length() - 1;

        while(left < ryt)
        {
            if(s.charAt(left) == s.charAt(ryt))
            {
                left++;
                ryt--;
            }

            else
            {
                return isPalindrome(s, left + 1, ryt) || isPalindrome(s, left, ryt -1);
            }
        }

        return true;
    }

    public static boolean isPalindrome(String s, int left, int ryt)
    {
        while(left < ryt)
        {
            if(s.charAt(left) == s.charAt(ryt))
            {
                left++;
                ryt--;
            }

            else
                return false;
        }

        return true;
    }
}