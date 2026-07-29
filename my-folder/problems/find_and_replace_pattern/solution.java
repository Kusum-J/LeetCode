class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        List<String> ans = new ArrayList<>();

        for(String word : words)
        {
            if(match(word, pattern))
                ans.add(word);
        }

        return ans;
    }

    private boolean match(String word, String pattern)
    {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i = 0 ; i < word.length(); i++)
        {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if(!map1.containsKey(w) && !map2.containsKey(p))
            {
                map1.put(w, p);
                map2.put(p, w);
            }

            else
            {
                if(map1.getOrDefault(w, '#') != p || map2.getOrDefault(p, '#') != w)
                    return false;
            }
        }

        return true;
    }
}