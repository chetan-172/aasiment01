/**
 * The "Biggest" class takes three numbers as input and determines which one is the largest.
 */
import java.util.*;
public class Biggest{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 3 numbers to find biggest");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

      // The code is determining the largest number among the three input numbers (`num1`, `num2`, and
      // `num3`).
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is greater than " +num2+ " and "+num3);
        }
         else if(num2>num1 && num2>num3){
            System.out.println(num2+" is greater than " +num1+ " and "+num1);
        }

        else{
            System.out.println(num3+" is greater than " +num1+ " and "+num2);   
        }
        sc.close();
    }
}