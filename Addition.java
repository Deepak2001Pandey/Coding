import java.util.Scanner;
public class Addition{
 public static void main(String[] args) {

   // create Scanner class object
   // to take the input
   Scanner scan = new Scanner(System.in);

   // declare variables
   int number1, number2, sum;


   // take input for first number 
   System.out.print("Enter first number: ");
   number1 = scan.nextInt();

   // take input for second number 
   System.out.print("Enter second number: ");
   number2 = scan.nextInt();

   // calculate the sum
   sum = number1 + number2;

   // display the result
   System.out.println("Sum = " + sum);
 }
}