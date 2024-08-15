package lets_get_certified.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
    // expected answer : ..\..\..\..\index.html
        Path p1 = Paths.get("/personal/./photos/../readme.txt"); // /personal/readme.txt
        Path p2 = Paths.get("/personal/index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3); // ../index.html
    }
}
