class Solution 
{
    public String reverseVowels(String s) 
    {
        char charArr[] = s.toCharArray();

        int left = 0;
        int ryt = s.length() - 1;

        while(left < ryt)
        {
            while(left < ryt && !isVowel(charArr[left]))
                left++;

            while(left < ryt && !isVowel(charArr[ryt]))
                ryt--;

            char temp = charArr[left];
            charArr[left] = charArr[ryt];
            charArr[ryt] = temp;

            left++;
            ryt--; 
        }

        return new String(charArr);
    }

    private boolean isVowel(char ch)
    {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' );
    }
}