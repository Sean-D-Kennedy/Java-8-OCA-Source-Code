package lets_get_certified.java_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // keyboard
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("You entered "+n);

        System.out.print("Enter a name: ");
        String name = sc.next();
        System.out.println("You entered "+name);
        
        List<String> names = new ArrayList<>();
    }
}
