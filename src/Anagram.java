/**
 * Created by jonesdc on 10/18/16.
 */
public class Anagram {

    public String isAnAnagram(String one, String two)
    {
        String is = "Anagrams";
        String isNot = "Not Anagrams";
        one = one.toLowerCase();
        two = two.toLowerCase();
        char[] tempOne = one.toCharArray();
        char[] tempTwo = two.toCharArray();
        int incrementer = 0;
        int test = one.length();

        if(one.length() == two.length())
        {
            for(int i = 0; i < one.length(); i++)
            {
                for(int j = 0; j < one.length(); j++)
                {
                    if(tempOne[i] == tempTwo[j])
                    {
                        tempTwo[j] = 0;
                        incrementer++;
                        j = one.length();
                    }
                }
            }
        }

        if(incrementer == one.length())
        {
            return is;
        }
        else
            return isNot;
    }
}
