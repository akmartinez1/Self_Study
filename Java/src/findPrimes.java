/**
 * Created by alanmartinez on 3/12/16.
 */

// Simple Java routine to find and display prime numbers.

public class findPrimes {

    public static void main(String[] args) {

        int primeNumberTrial = 0;             //The prime number candidate.
        int divisor = 0;                      //The number the prime candidate is divided by.
        int primeNumberCount = 0;             //Running count of prime numbers found.
        boolean foundDivisor = false;         //Boolean trigger if divisor for prime candidate is found.
        boolean foundPrime = false;

        //Temporarily set prime number candidate to 3.  When algorithm works permanently initialize candidate to 3.
        //First prime number is 2.  Divisor starts at 2.  Candidate must start at 3 for divisor test to work properly.
        primeNumberTrial = 3;

        //Perform loop.
        //Temporarily perform loop untl 10 prime numbers are found
        while (primeNumberCount > -1) {
            //Reset foundDivisor boolean to false for next number being tested.
            foundDivisor = false;

            //Temporarily print prime number candidate.  When algorithm works only print prime numbers.
            System.out.print("Prime number candidate:  " + primeNumberTrial);

            //loop through divisors until a candidate fails divisor test or until all possible possible divisor are tested.
            //First prime number is 2.  Divisor starts at 2.  Candidate must start at 3 for divisor test to work properly.
            for (divisor = 2; divisor < primeNumberTrial && foundDivisor == false; divisor++) {
                if (primeNumberTrial % divisor == 0) {
                    /*
                    If prime number candidate is evenly divided by divisor the 'modulu' operrator will not have a
                    remainder and return a 0.  Candidate is not a prime.

                    Set foundDivisor to true, increase primeNumberTrial to test the next number.
                     */

                    System.out.println("  is not a prime.  " + primeNumberTrial%divisor);
                    foundDivisor = true;
                    primeNumberTrial++;
                } else if (divisor + 1 == primeNumberTrial) {
                    /*
                    If divisor equals prime numaber candidate and passed 'modulo' (modulo does not equal 0) test then
                    candidate is a prime number.
                    Increase prime number count and trigger foundDivisor.
                     */
                    System.out.println("  is a prime.  " + primeNumberTrial%divisor + "Count:  " + primeNumberCount);
                    foundDivisor = true;
                    primeNumberTrial++;
                    primeNumberCount++;
                } else {
                    /*
                    if divisor test ('modulo (%)') returns a remainder of any kind then prime number candidate is still
                    eligible to be tested by the next divisor.  Do nothing at this point and let divisor increment
                    to the next value to test agains prime number candidate.
                     */
                }
                ;

            }
        }
    }


}
