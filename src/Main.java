import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int number = 0;
        int myNumber;
        boolean done = false;

        System.out.println("Welcome! Lets play a game.");
        System.out.println("Try to guess my number!");

        do {
            System.out.println("Please enter a number [1-10]");
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                scan.nextLine();
                if (1 <= number && number <= 10) {
                    done = true;
                }
                if (number < 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();
            }

        } while (!done);
    myNumber = (int)(Math.random() * 11) + 1;
        if (myNumber > number) {
            System.out.println("My number was " + myNumber + ".");
            System.out.println("Your guess was too low :(");
        }
        if (myNumber < number) {
            System.out.println("My number was " + myNumber + ".");
            System.out.println("Your guess was too high :(");
        }
        if (myNumber == number) {
            System.out.println("My number was " + myNumber + ".");
            System.out.println("Your guess was absolutely completely totally correct!");
        }




    }
}