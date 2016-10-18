import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jonesdc on 9/26/16.
 */
public class ArrayAdd {

    public int addTheArray(int[] integerArray)
    {
        int sum = 0;
        for(int i = 0; i < integerArray.length; i++)
        {
            int temp = integerArray[i];
            sum = sum + temp;
        }
        return sum;
    }

}
