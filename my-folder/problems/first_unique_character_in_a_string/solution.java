class Solution 
{
    public int firstUniqChar(String s) 
    {
        char[] chArray = s.toCharArray();

        for(int i = 0; i < chArray.length; i++)
        {
            boolean unique = true;

            for(int j = 0; j < chArray.length; j++)
            {
                if(i != j && chArray[i] == chArray[j])
                {
                    unique = false;
                    break;
                }
            }

            if(unique)
            {
                return i;
            }
        }

        return -1;
    }
}