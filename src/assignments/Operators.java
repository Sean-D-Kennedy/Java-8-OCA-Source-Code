package lets_get_certified.assignments;

import java.util.Scanner;

public class Operators {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        logicalOps(x,y);
        simpleMaths(x,y);
        boolean mod = modulus(x,y);
        System.out.println(mod);
        incrDecr();

    }

    public static boolean modulus(int x, int y) {
        if (x % y == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void logicalOps(int x, int y) {
        if (x > 0 && y > 0) { 
            System.out.println("both numbers are positive");
        } else if (x < 0 && y < 0) {
            System.out.println("both numbers are negative");
        } else if (x == 0 || y == 0) { // T || 
            System.out.println("one of the numbers is 0");
        } else if (x < 0 || y < 0) {
            System.out.println("one of the numbers is negative");
        }
    }

    public static void simpleMaths(int x, int y) {
        int sum = x + y;
        // Assuming x is 10, y is 2 and sum is 12
        // "The sum of " + 10               => "The sum of 10"
        // "The sum of 10" + " and "        => "The sum of 10 and "
        // "The sum of 10 and " + 2         => "The sum of 10 and 2"
        // "The sum of 10 and 2" + " is "   => "The sum of 10 and 2 is "
        // "The sum of 10 and 2 is " + 12   => "The sum of 10 and 2 is 12"
        System.out.println("The sum of " + x + " and " + y + " is " + sum);   
        int difference = x - y;
        System.out.println("The difference of " + x + " and " + y + " is " + difference);
        int product = x * y;
        System.out.println("The product of " + x + " and " + y + " is " + product);
        int quotient = x / y;
        System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
    }

    public static void incrDecr() {
        int x=4, w = 0, y = 0 , z = 0;

        System.out.println(++x);//5 - pre-increment x and then output x
        System.out.println(x++);//5 - output x and then post-increment x
        System.out.println(x);  //6
        
        System.out.println(--x);//5 - pre-decrement x and then output x
        System.out.println(x--);//5 - output x and then post-decrement x
        System.out.println(x);  //4

        w = 20;
        x = 10;
        y = -5;
        z = 0;
        System.out.println(w == x && y != z);// F &&     == false
        System.out.println(w == x || y != z);// F || T   == true
        System.out.println(!(w == (x + z))); // !(20 == (10 + 0)) == !(20 == 10) == !(F) == true

    }

}
