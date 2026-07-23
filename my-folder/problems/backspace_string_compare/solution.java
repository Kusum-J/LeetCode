class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while(i >= 0 || j >= 0)
        {
            i = getNextValidChar(s, i);
            j = getNextValidChar(t, j);

            if(i < 0 || j < 0)
                return i==j;

            if(s.charAt(i) != t.charAt(j))
                return false;

            i--;
            j--;
        }

        return true;
    }

    private int getNextValidChar(String str, int index)
    {
        int backspaces = 0;

        while(index >= 0)
        {
            if(str.charAt(index) == '#')
            {
                backspaces++;
                index--;
            }

            else if(backspaces > 0)
            {
                backspaces--;
                index--;
            }

            else
                break;
        }

        return index;
    }
}