import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonesdc on 4/25/16.
 */
public class JTest {


    @Test  //ReverseString class -- Is the string reversed?
    public void hasTheStringBeenReversed() {
        ReverseString reverseString = new ReverseString();
        assertEquals("REVERSE", reverseString.reverse("ESREVER"));
    }

    @Test //Palindrome class -- Is the string a palindrome Yes?
    public void isTheStringAPalindromeOne() {
        Palindrome palinDrome = new Palindrome();
        assertEquals("Yes", palinDrome.isAPalindrome("racecar"));
    }

    @Test //Palindrome class -- Is the string a palindrome No?
    public void isTheStringAPalindromeTwo() {
        Palindrome palinDrome = new Palindrome();
        assertEquals("No", palinDrome.isAPalindrome("thisisnotapalindrome"));
    }

    @Test //Anagram class -- Is the string an anagram Yes?
    public void isTheStringAnAnagramOne() {
        Anagram anagram = new Anagram();
        assertEquals("Anagrams", anagram.isAnAnagram("anagram", "margana"));
    }

    @Test //Anagram class -- Is the string an anagram Yes?
    public void isTheStringAnAnagramTwo() {
        Anagram anagram = new Anagram();
        assertEquals("Not Anagrams", anagram.isAnAnagram("anagramm", "marganaa"));
    }

    @Test //Anagram class -- Is the string an anagram Yes?
    public void isTheStringAnAnagramThree() {
        Anagram anagram = new Anagram();
        assertEquals("Anagrams", anagram.isAnAnagram("Hello", "hello"));
    }

    @Test
    public void doWeNeedAGasRefillTestOne() {
        double[] driveDistancesOne = {12,6,17,5,20};
        GasMileage gasMileage = new GasMileage();
        assertFalse(gasMileage.gasPrediction(driveDistancesOne, 0.25, 25));
    }

    @Test
    public void doWeNeedAGasRefillTestTwo() {
        double[] driveDistancesTwo = {10,20,30,90,40,50};
        GasMileage gasMileage = new GasMileage();
        assertTrue(gasMileage.gasPrediction(driveDistancesTwo, 10, 1.9));
    }

    @Test
    public void addTheElementsInTheArray(){
        int[] integerArray = {1, 2, 3, 4, 10, 11};
        ArrayAdd addArray = new ArrayAdd();
        assertEquals(addArray.addTheArray(integerArray), 31);
    }

    @Test
    public void ifDivisibleByThreeItPrintsFizz(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.fizzOrBuzz(9), "fizz");
    }

    @Test
    public void ifDivisibleByFiveItPrintsBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.fizzOrBuzz(25), "buzz");
    }

    @Test
    public void ifDivisibleByBothThreeAndFiveItPrintsFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.fizzOrBuzz(30), "fizzbuzz");
    }

    @Test
    public void ifNotDivisibleByAnythingItPrintsNeither(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.fizzOrBuzz(29), "Not divisible by 3 or 5");
    }


    @Test
    public void ifNegativeInputReturnZero(){
        Fibbonacci fib = new Fibbonacci();
        assertEquals(fib.fibToN(-10, 5), 0);
    }

    @Test
    public void ifZeroInputReturnZero(){
        Fibbonacci fib = new Fibbonacci();
        assertEquals(fib.fibToN(0, 15), 0);
    }

    @Test
    public void ifInputIsOneAndNIsFive(){
        Fibbonacci fib = new Fibbonacci();
        assertEquals(fib.fibToN(1, 5), 13);
    }

    @Test
    public void ifInputIsOneAndNIsSix(){
        Fibbonacci fib = new Fibbonacci();
        assertEquals(fib.fibToN(1, 6), 21);
    }

    @Test
    public void ifInputIsOneAndNIs7(){
        Fibbonacci fib = new Fibbonacci();
        assertFalse(fib.fibToN(1, 7) == 500);
    }

    @Test
    public void testArraySort(){
        Duplicate dup = new Duplicate();
        int[] a = {2, 1, 3, 5, 3, 2};
        dup.firstDuplicate(a);
    }
}