package assignments;

import java.util.Scanner;

public class WhileExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        thirdOrderPolynomial();
//        whileAverage();
//        whileGrades();
//        whileHistogram();
        whileLargestSmallest();
    }

    // Example:
    public static void userInputTerminatesLoop() {
        String userInput = "y";

        System.out.print("Start (y/n)? ");
        userInput = sc.next();

        while (userInput.equalsIgnoreCase("y")) {
            // do something...

            System.out.print("Continue (y/n)? ");
            userInput = sc.next();
        }

    }

    // 1.
    public static void thirdOrderPolynomial() {
        // 3rd Order Polynomial
        // f(x) = ax3 + bx2 + cx + d

        double b = 0, c = 0, d = 0, x = 0;
        String keepGoing = "y";

        // Get the coefficients of the polynomial
        System.out.println("Enter coefficient a  --> ");
        double a = sc.nextDouble();
        System.out.println("Enter coefficient b  --> ");
        b = sc.nextDouble();
        System.out.println("Enter coefficient c  --> ");
        c = sc.nextDouble();
        System.out.println("Enter coefficient d  --> ");
        d = sc.nextDouble();

        while (keepGoing.equalsIgnoreCase("y")) {
            // input x value
            System.out.println("Enter the x value  --> ");
            x = sc.nextDouble();

            // calculate and display the value of the polynomial at x
            // note: * has higher precedence than + i.e. no need for ()
            double fx = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;
            System.out.println("The value of the polynomial at " + x + " is " + fx);

            // ask user if he/she wants to continue
            System.out.println("Do you wish to continue (y/n) --> ");
            keepGoing = sc.next();
        }

  //      System.out.println(x);
    }

    // 2.
    public static void whileAverage() {
        double num = 0, total = 0, average = 0;
        int numbersEntered = 0, n = 0;

        System.out.println("How many numbers in the sequence  --> ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n was invalid: " + n);
        } else {
            while (numbersEntered < n) {
                System.out.println("Please enter a number  --> ");
                num = sc.nextDouble();
                total += num;
                numbersEntered++;
            }
            average = total / n; // n cannot be 0 here
            System.out.println("Average is " + average);
        }
    }

    // 3.
    public static void whileGrades() {
        String grade = "";
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0;

        // the very first grade
        System.out.println("Enter a grade (a-fA-F) or x/X to exit ? ");
        grade = sc.next().toLowerCase();

        // comparing references
        // while(grade != "x") {}
        // comparing the objects values...
        while (!grade.equals("x")) { // if its an "x" then !T == F
            switch (grade) {
                case "a":
                    aCount++;
                    break;
                case "b":
                    bCount++;
                    break;
                case "c":
                    cCount++;
                    break;
                case "d":
                    dCount++;
                    break;
                case "e":
                    eCount++;
                    break;
                case "f":
                    fCount++;
                    break;
                default:
                    System.out.println("Error: " + grade);
                    break;
            }
            // the other grades...
            System.out.println("Enter a grade (a-fA-F) or x/X to exit ? ");
            grade = sc.next().toLowerCase();
        }
        System.out.println("Number of A's is " + aCount);
        System.out.println("Number of B's is " + bCount);
        System.out.println("Number of C's is " + cCount);
        System.out.println("Number of D's is " + dCount);
        System.out.println("Number of E's is " + eCount);
        System.out.println("Number of F's is " + fCount);

    }

    // 4.
    public static void whileHistogram() {
        System.out.println("Enter number of rows --> ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols --> ");
        int cols = sc.nextInt();

        // Assume user inputs 2 rows and 5 cols:
        // *****
        // *****
        // 2 loops:
        // outer going from 1..2
        // inner loop goes from 1..5
        int i = 1, j = 1;
        while (i <= rows) {
            j = 1; // reset j for rows 2,3,4....
            while (j <= cols) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // goto next line
            i++;
        }

    }

    // 5.
    public static void whileLargestSmallest() {
        int i = 1, smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE, n = 0;

        System.out.println("Enter n --> ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n was invalid: " + n);
        } else {
            // ok
            while (i <= n) {
                System.out.println("Enter a number --> ");
                int number = sc.nextInt();

                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }

                i++;
            }
            System.out.println("The largest number is " + largest);
            System.out.println("The smallest number is " + smallest);
        }
    }

}
