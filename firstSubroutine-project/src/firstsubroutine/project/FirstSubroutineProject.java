/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

package firstsubroutine.project;
import java.math.BigInteger;
import java.util.Scanner;

public class FirstSubroutineProject {
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        int choice;
        int number = 0;
        
        do{
            System.out.println("What would you like to do?:");
            System.out.println("[1] calculate the factorial of a number ");
            System.out.println("[2] calculate if a number is prime");
            System.out.println("[0] exit");
            choice = stringInput.nextInt();
            if (choice <= 2 && choice > 0){
                System.out.println("\nYou have selected " + choice + ". Please enter a number: ");
                number = stringInput.nextInt();
            }
            
            
            switch (choice) {
                case 1:
                    factorialAndOut(number);
                    break;
                case 2:
                    primeAndOut(number);
                    break;
                case 0:
                    System.out.println("exiting...");
                    System.exit(0);
                default:
                    System.out.println("Error: Invalid 'choice' input.");
                    break;
            }
            
        } while (true);
        
    }
    
    private static void factorialAndOut(int input) {
        BigInteger fact = new BigInteger("1");
        
        for (int i = 1; i <= input; i = i + 1) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        
        System.out.println(fact);
    }
    
    private static void primeAndOut(int input) {
        long num = input;
        boolean isPrime = true;
        
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " is a prime number.\n");
        } else{
            System.out.println(num + " is not a prime number.\n");
        }
    }

}

