class Solution {
    public boolean isPalindrome(String s) 
    {
        int left = 0;
        int ryt = s.length() - 1;

        while(left < ryt)
        {
            while(left < ryt && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }

            while(left < ryt && !Character.isLetterOrDigit(s.charAt(ryt)))
            {
                ryt--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(ryt)))
            {
                return false;
            }
            left++;
            ryt--;
        }
        return true;
    }
}