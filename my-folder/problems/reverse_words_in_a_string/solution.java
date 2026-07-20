class Solution {
    public String reverseWords(String s) 
    {
        // \s+ : treats all the separate whitespaces as a single character.
        // \s : any space character : tab, newline, etc
        // + : combines all of them

        String[] words = s.trim().split("\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) 
        {
            result.append(words[i]).append(" ");
        }
        
        return result.toString().trim();
    }
}