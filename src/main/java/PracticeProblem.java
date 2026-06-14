/**
	* File: Lesson 4.6 - dataTypeChecking
	* Author: Auton
	* Date Created: April 15, 2026
	* Date Last Modified: Jun 14, 2026
*/	
import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
    }

    public static int intChecker() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer: ");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Input an integer: ");
        }

        return input.nextInt();
    }

    public static double doubleChecker() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.print("Input a number: ");
        }

        return input.nextDouble();
    }

    public static boolean booleanChecker() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a boolean: ");
        while (!input.hasNextBoolean()) {
            input.nextLine();
            System.out.print("Input a boolean: ");
        }

        return input.nextBoolean();
    }

    public static boolean multipleIntChecker() {
        Scanner input = new Scanner(System.in);

        int count = 0;

        while (count < 4) {
            System.out.print("Input an integer: ");
            while (!input.hasNextInt()) {
                input.nextLine();
                System.out.print("Input an integer: ");
            }

            input.nextInt();
            count++;
        }

        return true;
    }
}