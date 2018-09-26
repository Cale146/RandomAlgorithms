/**
 * Created by cale146 on 9/25/18.
 */
public class FizzBuzz {

    public String fizzOrBuzz(int calculate){
        String notDivisible = "Not divisible by 3 or 5";
        if(calculate%3 == 0)
            return "fizz";
        else if (calculate % 5 == 0)
            return "buzz";
        else if (calculate%3 == 0 & calculate%5 == 0)
            return "fizzbuzz";
        return notDivisible;
    }
}
