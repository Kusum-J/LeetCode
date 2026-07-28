class Solution {
    public String reverseStr(String s, int k) 
    {
        char[] characters = s.toCharArray();

        for(int start = 0 ;start < characters.length; start += 2 * k)
        {
            int left = start;
            int ryt = Math.min(start + k - 1, characters.length - 1);

            while(left < ryt)
            {
                char temp = characters[left];
                characters[left] = characters[ryt];
                characters[ryt] = temp;

                left++;
                ryt--;
            }
        }

        return new String(characters);
    }
}