package lets_get_certified.assignments;

import java.util.Scanner;

public class ConditionalLogic {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        preAndPostDifference(); 					// 1.	
//        booleanLogicShortCircuitOps();				// 2.
//    	booleanBitwiseOps();						// 3.
//        compareStrings();						// 4.
//        System.out.println("Enter cert. of film --> ");
//        int cert = sc.nextInt();
//        System.out.println("Enter age of the customer --> ");
//        int age = sc.nextInt();
//        
//        boolean okToWatchFilm = admitToFilm(cert,age);		// 5.
//        System.out.println(okToWatchFilm);

//        switchVowelOrConsonant();					// 6.
//        ifMonth();							// 7.
//        ifGrade();							// 8.
//        switchMathOperation();					// 9.
//        ifTemperature();						// 10.
        switchDaysInMonth();						// 11.
    }// end of main()

    // 1.
    public static void preAndPostDifference() { // method definition
        int x = 5, y = 10;

        System.out.println("x is " + x);	// 5
        System.out.println("++x is " + ++x);	// 6
        System.out.println("x++ is " + x++);	// 6
        System.out.println("x is " + x);	// 7

        System.out.println("y is " + y);	// 10
        System.out.println("--y is " + --y);	// 9
        System.out.println("y-- is " + y--);	// 9
        System.out.println("y is " + y);	// 8
    }

    // 2.
    public static void booleanLogicShortCircuitOps() {
        // F &&     short circuit (overall expr cannot become true)
        // T ||     short circuit (overall expr cannot become false)

        boolean b = false;
        int x = 3;

        if (x < 0 && (b = true)) { // F &&     == F
            System.out.println("first if stmt");
        }
        System.out.println(b);//false

        if (x > 0 || (b = true)) { // T ||     == T
            System.out.println("second if stmt");
        }
        System.out.println(b);//false        
    }

    // 3.
    public static void booleanBitwiseOps() { // non short-circuit
        boolean b = false;
        int x = 3;

        if (x < 0 & (b = true)) { // F & T == F
            System.out.println("first if stmt");
        }
        System.out.println(b);//true

        b = false;//reset

        if (x > 0 | (b = true)) { // T | T == T
            System.out.println("second if stmt");
        }
        System.out.println(b);//true

    }

    // 4.
    public static void compareStrings() {
        System.out.println("Enter s1: ");
        String s1 = sc.next();
        System.out.println("Enter s2: ");
        String s2 = sc.next();

        System.out.println(s1 == s2);	// false
        System.out.println(s1.equalsIgnoreCase(s2));	// true

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);	// true
    }

    // 5.
    public static boolean admitToFilm(int cert, int age) {
//        if (age >= cert) {
//            return true;
//        } else {
//            return false;
//        }

        // ternary operator
         boolean isOK = age >= cert ? true : false;
         return isOK;
    }

    // 6.
    public static void switchVowelOrConsonant() {
        System.out.println("Enter a char --> ");
        char letter = sc.next().charAt(0);// char range is 0..65535

        // if ( A || B )
//        if (       (letter >= 'a' && letter <= 'z')
//                || (letter >= 'A' && letter <= 'Z')   ) { // letter is OK
//        	System.out.println("Valid letter : "+ letter);
        if (Character.isLetter(letter)) {
            switch (letter) {
                default:
                    System.out.println(letter + " is a consonant");
                    break;
                case 'a': case 65: // 65 == 'A'
                case 'E': case 'e':
                case 'I': case 'i':
                case 'O': case 'o':
                case 'U': case 'u':
                    System.out.println(letter + " is a vowel");
                    break;
            }
        } else {
            System.err.println("Invalid letter : " + letter);
        }

    }

    // 7. 
    public static void ifMonth() {
        // declaring some constants
        final int JAN = 1, FEB = 2, MARCH = 3, APRIL = 4, MAY = 5, JUNE = 6;

        try {
            System.out.println("Enter a month (1..6) --> ");
            int month = sc.nextInt();

            if (month == JAN) {
                System.out.println("January");
            } else if (month == FEB) {
                System.out.println("February");
            } else if (month == MARCH) {
                System.out.println("March");
            } else if (month == APRIL) {
                System.out.println("April");
            } else if (month == MAY) {
                System.out.println("May");
            } else if (month == JUNE) {
                System.out.println("June");
            } else {
                System.out.println("Month is out of range: " + month);
            }
        } catch (Exception ex) {
            System.out.println("Exception caught!");
            ex.printStackTrace();
        }

//        switch(month){
//            case JAN:
//                System.out.println("January");
//                break;
//            case FEB:
//                System.out.println("February");
//                break;
//            case MARCH:
////            case MARCH:   // cannot have duplicate labels
//                System.out.println("March");
//                break;
//            case APRIL:
//                System.out.println("April");
//                break;
//            case MAY:
//                System.out.println("May");
//                break;
//            case JUNE:
//                System.out.println("June");
//                break;
//            default:
//                System.out.println("Month is out of range: " + month);
//                break;
//        }
    }

    // 8.
    public static void ifGrade() {
        try {
            System.out.println("Enter a mark (0..100) --> ");
            int mark = sc.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Mark is out of range: " + mark);
            } else {
                //valid mark range is 0..100
    //                System.out.println("Valid mark "+ mark);
    //            	if (mark >= 70 && mark <= 100) {
                if (mark >= 70) {
                    System.out.println("A");
                } else if (mark >= 60) {
                    System.out.println("B");
                } else if (mark >= 50) {
                    System.out.println("C");
                } else if (mark >= 40) {
                    System.out.println("D");
                } else {
                    System.out.println("Fail");
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception caught!");
            ex.printStackTrace();
        }

    }

    // 9.
    public static void switchMathOperation() {
        double answer = 0.0;
        boolean operationOK = true;

        System.out.println("Enter a number --> ");
        double num1 = sc.nextDouble();
        System.out.println("Enter a number --> ");
        double num2 = sc.nextDouble();

        System.out.println("Enter an operation --> ");
        String operation = sc.next();

        switch (operation) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
            default:
                System.out.println("Unknown math. operator : " + operation);
                operationOK = false;
                break;
        }

//        if (operationOK == true) {
        if (operationOK) {
            System.out.println("Answer is " + answer);
        }
    }

    // 10.
    public static void ifTemperature() {
        int temperature = 0;
        final int COLD = 0;
        final int MILD = 15;
        final int WARM = 20;
        final int VERY_WARM = 25;
        final int HOT = 30;

        try{
            System.out.println("Enter temperature (0..30) --> ");
            temperature = sc.nextInt();
            if (temperature <= COLD) {
                System.out.println("Cold");
            } else if (temperature > COLD && temperature < MILD) {
                System.out.println("A little cold but ok...");
            } else if (temperature >= MILD && temperature < WARM) {
                System.out.println("Mild");
            } else if (temperature >= WARM && temperature < VERY_WARM) {
                System.out.println("Warm");
            } else if (temperature >= VERY_WARM && temperature < HOT) {
                System.out.println("Very warm");
            } else if (temperature >= HOT) {
                System.out.println("Hot");
            }
        } catch (Exception ex){
            System.err.println("Exception caught!");
            ex.printStackTrace();
        }

    }

    // 11. 
    public static void switchDaysInMonth() {
        int numDays = 0;

        final int JAN = 1;  final int FEB = 2;  final int MAR = 3;
        final int APR = 4;  final int MAY = 5;  final int JUN = 6;
        final int JUL = 7;  final int AUG = 8;  final int SEP = 9;
        final int OCT = 10; final int NOV = 11; final int DEC = 12;

        System.out.println("Enter month --> ");
        int month = sc.nextInt();

        switch (month) {
            case JAN: case MAR: case MAY:
            case JUL: case AUG: case OCT:
            case DEC:
                numDays = 31;
                break;
            case APR: case JUN: case SEP:
            case NOV:
                numDays = 30;
                break;
            case FEB:
                System.out.println("Enter year --> ");
                int year = sc.nextInt();
//                if( (A) || (B && C)    ){
                if ((year % 400 == 0)
                        || (year % 4 == 0 && !(year % 100 == 0))) {
                    numDays = 29; // leap year
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month: " + month);
                break;

        }
        System.out.println("Number of days is: " + numDays);
    }

}// end of class
/*
     public static void ternaryOperator() {
        boolean isHappy = false;
        String mood
                = isHappy ? "I am happy" : "I am sad";
        System.out.println(mood);

        System.out.println("Enter x --> ");
        int x = sc.nextInt();
        System.out.println("Enter y --> ");
        int y = sc.nextInt();

        int minVal
                = x < y ? x : y;
        System.out.println(minVal);

    }
 */
