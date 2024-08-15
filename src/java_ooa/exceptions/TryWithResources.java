package lets_get_certified.java_ooa.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
class MyCloseable implements AutoCloseable{
    private final char letter;
    MyCloseable(char letter){ this.letter=letter;}
    @Override
    public void close(){
        System.out.println(letter);
    }
}
public class TryWithResources {
    public static void main(String[] args) {
        try(MyCloseable c1 = new MyCloseable('A');
            MyCloseable c2 = new MyCloseable('B')){
                // ArithmeticException IS-A RuntimeException
                int x = 5/0;
        }catch(ArithmeticException ae){
            System.out.println("Exception: Divide by Zero");
        }finally{
            System.out.println("Custom finally");
        }
    }
}
*/

public class TryWithResources {
    public static void main(String[] args) throws IOException {       
        // Note: No catch or finally required. finally is implicit.
        // However, main() must declare that it throws IOException.
        // 'out' closed first, then 'in'.
        try(FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt")    ){             
        }
        // Scope is local i.e. ok to use 'in' again.
        try(FileInputStream in = new FileInputStream("in.txt");
            FileOutputStream out = new FileOutputStream("out.txt")    ){
        }
    } 
}


