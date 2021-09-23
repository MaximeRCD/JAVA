package UserInput;
import java.util.Scanner;
// Scanners can be used to read input from user but also from files

public class User_input {
    public static void main(String[] args) {
        // declare a scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = scanner.nextLine();
        System.out.println("How old are you ? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // be careful calling  nextLine after next...
        System.out.println("What is your favorite food ?");
        String food = scanner.nextLine();
        // when we enter an int we press enter so in the scanner there is 18\n
        // NextInt reads 18 and leaves \n in the scanner so when we call NextLine
        // the scanner provides \n, and so we step side the line.
        // Fix : add a scanner.nextLine() after each scan which is not nextLine.

        System.out.println("Hello " + name);
        System.out.println("You are  " + age + " right ?");
        System.out.println("Your favorite food is " + food + " right ?");

    }
}
