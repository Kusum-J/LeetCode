class Solution {
    public int maxVowels(String s, int k) 
    {

        int count = 0;

        // first window
        for (int i = 0; i < k; i++) 
        {
            if (isVowel(s.charAt(i)))
                count++;
        }

        int max = count;

        // slide the window
        for (int i = k; i < s.length(); i++) 
        {

            // get rid of left character
            if (isVowel(s.charAt(i - k)))
                count--;

            // add new right character
            if (isVowel(s.charAt(i)))
                count++;

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}