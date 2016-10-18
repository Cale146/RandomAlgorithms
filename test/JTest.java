import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonesdc on 4/25/16.
 */
public class JTest {

    @Test  //Is the string reversed?
    public void hasTheStringBeenReversed()
    {
        ReverseString reverseString = new ReverseString();
        Assert.assertEquals("REVERSE", reverseString.reverse("ESREVER"));
    }

    @Test //Is the string a palindrome
    public void isTheStringAPalindrome()
    {
        Palindrome palinDrome = new Palindrome();
    }

    @Test
    public void doWeNeedAGasRefillTestOne()
    {
        double[] driveDistancesOne = {12,6,17,5,20};
        GasMileage gasMileage = new GasMileage();
        assertFalse(gasMileage.gasPrediction(driveDistancesOne, 0.25, 25));
    }

    @Test
    public void doWeNeedAGasRefillTestTwo()
    {
        double[] driveDistancesTwo = {10,20,30,90,40,50};
        GasMileage gasMileage = new GasMileage();
        assertTrue(gasMileage.gasPrediction(driveDistancesTwo, 10, 1.9));
    }

    @Test
    public void addTheElementsInTheArray()
    {
        int[] integerArray = {1, 2, 3, 4, 10, 11};
        ArrayAdd addArray = new ArrayAdd();
        assertEquals(addArray.addTheArray(integerArray), 31);
    }
}