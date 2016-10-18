import java.util.Scanner;

/**
 * Created by jonesdc on 10/18/16.
 */
public class Palindrome {

    public String isAPalindrome(String testString)
    {
        char[] temp = testString.toCharArray();
        char[] finalChar = new char[temp.length];

        for(int i = 0; i <= testString.length()/2; i++)
        {
            finalChar[i] = temp[temp.length-1-i];
            finalChar[temp.length-1-i] = temp[i];
        }
        String finalString = String.valueOf(finalChar);
        if(finalString.equals(testString))
            return "Yes";
        else
            return "No";
    }
}
