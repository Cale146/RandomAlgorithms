import java.util.List;

/**
 * Created by jonesdc on 4/25/16.
 */
public class ReverseString {

    public String reverse(String testString)
    {
        char[] originalStringArray = testString.toCharArray();
        int begin = 0;
        int end = originalStringArray.length -1;

        char temp;

        for(int i = 0; i < originalStringArray.length/2; i++)
        {
            temp = originalStringArray[begin];
            originalStringArray[begin] = originalStringArray[end];
            originalStringArray[end] = temp;
            begin++;
            end--;
        }

        return new String(originalStringArray);
    }

}
