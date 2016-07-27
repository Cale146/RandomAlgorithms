import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

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

}

