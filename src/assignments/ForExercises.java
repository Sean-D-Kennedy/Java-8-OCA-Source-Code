package assignments;

import java.util.Scanner;

public class ForExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        forLargestSmallest();
//        forHistogram();
//        forAverage();
        twelveDaysOfChristmas();
    }
    // 1.
    public static void forLargestSmallest() {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE, n = 0;

        System.out.println("Enter n --> ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n was invalid: " + n);
        } else {
            // ok
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter a number --> ");
                int number = sc.nextInt();
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }

            }
            System.out.println("The largest number is " + largest);
            System.out.println("The smallest number is " + smallest);
        }
    }

    // 2.
    public static void forHistogram() {
        System.out.println("Enter number of rows --> ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols --> ");
        int cols = sc.nextInt();

        // Assume user inputs 2 rows and 5 cols:
        //      *****
        //      *****
        // 2 loops:
        //    outer going from 1..2
        //      inner loop goes from 1..5
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println(); // goto next line
        }

    }

    // 3.
    public static void forAverage() {
        double num = 0, total = 0, average = 0;

        System.out.println("How many numbers in the sequence  --> ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n was invalid: " + n);
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("Please enter a number  --> ");
                num = sc.nextDouble();
                total += num; // total = total + num;
                //total += sc.nextDouble();
            }
            average = total / n;	// n cannot be 0 here
            System.out.println("Average is " + average);
        }
    }

    // 4.
    public static void twelveDaysOfChristmas() {
        final int NUM_DAYS_IN_CHRISTMAS = 12;

        for (int day = 1; day <= NUM_DAYS_IN_CHRISTMAS; day++) {
            System.out.print("On the ");
            switch (day) {
                case 1:
                    System.out.print("first");
                    break;
                case 2:
                    System.out.print("second");
                    break;
                case 3:
                    System.out.print("third");
                    break;
                case 4:
                    System.out.print("fourth");
                    break;
                case 5:
                    System.out.print("fifth");
                    break;
                case 6:
                    System.out.print("sixth");
                    break;
                case 7:
                    System.out.print("seventh");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("ninth");
                    break;
                case 10:
                    System.out.print("tenth");
                    break;
                case 11:
                    System.out.print("eleventh");
                    break;
                case 12:
                    System.out.print("twelfth");
                    break;
            }// end switch
            System.out.println(" day of Christmas\nMy true love sent to me: ");
            
            switch (day) {
                case 12:
                    System.out.println("\tTwelve drummers drumming, ");
                case 11:
                    System.out.println("\tEleven pipers piping, ");
                case 10:
                    System.out.println("\tTen lords a-leaping, ");
                case 9:
                    System.out.println("\tNine ladies dancing, ");
                case 8:
                    System.out.println("\tEight maids a-milking, ");
                case 7:
                    System.out.println("\tSeven swans a-swimming, ");
                case 6:
                    System.out.println("\tSix geese a-laying, ");
                case 5:
                    System.out.println("\tFive gold rings, ");
                case 4:
                    System.out.println("\tFour calling birds, ");
                case 3:
                    System.out.println("\tThree French hens, ");
                case 2:
                    System.out.println("\tTwo turtle doves, ");
                case 1:
                    System.out.println("\tA partridge in a pear tree, ");
            }
        }// for
    }
}
