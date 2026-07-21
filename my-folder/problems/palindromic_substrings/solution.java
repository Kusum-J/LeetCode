class Solution 
{
    int ans = 0;

    public int countSubstrings(String s) 
    {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            ans += expand(s, i, i);       // Odd length
            ans += expand(s, i, i + 1);   // Even length
        }

        return ans;

    }

     private int expand(String s, int left, int right) 
     {
        int count = 0;

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;

            count++;
        }

        return count;

    }

}