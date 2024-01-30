/**
 * The above Java class calculates and prints the Fibonacci series up to a given number of terms.
 */
import java.util.*;
public class Fibbnacci {
  
        public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("enter number to get fibbonacci series ");
      int n=sc.nextInt();
      int firstTerm = 0, secondTerm = 1;
      System.out.println("Fibonacci Series till " + n + " terms:");
     // The code block you provided is a for loop that calculates and prints the Fibonacci series up to
     // a given number of terms.
      
      for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
      
            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
          }
          sc.close();
        }
      }

