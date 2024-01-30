/**
 * The PrimeNumber class takes a lower and upper bound from the user and prints all prime numbers
 * within that range.
 */
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the lower bound of the range: ");
        int Start = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int End = sc.nextInt();

    
       // This code block is checking if the user input for the lower bound (`Start`) is greater than
       // or equal to 2 and if the user input for the upper bound (`End`) is greater than or equal to
       // the lower bound. If both conditions are true, it means the input is valid and it proceeds to
       // print the prime numbers between the lower and upper bounds using the
       // `printPrimeNumbersInRange` method. If the conditions are not met, it prints an error message
       // indicating that the input is invalid.
        if (Start >= 2 && End >= Start) {
            System.out.println("Prime numbers between " + Start + " and " + End + ":");
            printPrimeNumbersInRange(Start, End);
        } else {
            System.out.println("Invalid input. Please make sure the lower bound is at least 2 and the upper bound is greater than or equal to the lower bound.");
        }

        sc.close();
    }

/**
 * The function checks if a given number is prime or not.
 * 
 * @param num The parameter "num" is an integer that represents the number we want to check for
 * primality.
 * @return The method isPrime is returning a boolean value. It returns true if the given number is
 * prime, and false otherwise.
 */

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


  /**
   * The function prints all prime numbers within a given range.
   * 
   * @param Start The starting number of the range for which we want to find prime numbers.
   * @param End The "End" parameter represents the upper limit of the range of numbers for which we
   * want to find prime numbers.
   */
    private static void printPrimeNumbersInRange(int Start, int End) {
        for (int i = Start; i <= End; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }


}
