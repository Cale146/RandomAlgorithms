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

    @Test
    public void doWeNeedAGasRefillTestOne()
    {
        double[] driveDistancesOne = {12,6,17,5,20};
        GasMileage gasMileage = new GasMileage();
        assertFalse(gasMileage.gasPrediction(driveDistancesOne, 0.25, 25));
    }

    @Test
    public void oWeNeedAGasRefillTestTwo()
    {
        double[] driveDistancesTwo = {10,20,30,90,40,50};
        GasMileage gasMileage = new GasMileage();
        assertTrue(gasMileage.gasPrediction(driveDistancesTwo, 10, 1.9));
    }
}