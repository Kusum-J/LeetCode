class Solution {
    public int removePalindromeSub(String s) 
    {
        int left = 0;
        int ryt = s.length() - 1;

        while(left < ryt)
        {
            if(s.charAt(left) != s.charAt(ryt))
                return 2;

            left++;
            ryt--;
        }

        return 1;
    }
}