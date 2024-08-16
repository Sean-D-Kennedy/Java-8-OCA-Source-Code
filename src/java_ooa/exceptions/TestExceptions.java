package java_ooa.exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptions {
    public static void main(String[] args) {
        try{
            spillTea();
            System.out.println("Will never get here!");
        }catch(RuntimeException rte){
            getAnotherCup();
        }
        enjoyRestOfVideo();
    }
    public static void spillTea(){
        System.out.println("Spilling tea... ");
        throw new RuntimeException();
    }
    public static void getAnotherCup(){
        System.out.println("Getting another cup");
    }
    public static void enjoyRestOfVideo(){
        System.out.println("Enjoying rest of video...");
    }
}
/*
    public static void main(String[] args) {
        try{
            a();
        }catch(EOFException eofe){ 
        }
    }
    public static void a() throws EOFException{
        // The method does not throw any exception at all.
        // Regardless, the compiler ensures however that 
        // main() has to catch or declare EOFException.
    }

*/

/*
    public static void main(String[] args) {
        
        String s = m();
        System.out.println(s);// Finally
    }
    public static String m(){
        String s = "";
        
        try{
            s = "Ok";
            throw new RuntimeException();
//            return s; // unreachable
        }catch(Exception e){
            s = "Catch";
            return s;
        }finally{
            s = "Finally";
            return s;
        }
    }

*/
/*
        try{
            int x = -8;
            
            System.out.println("protected code 1");
            if(x < 0){
                throw new RuntimeException();
            }
            System.out.println("protected code 2");
        }catch(Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        System.out.println("continuing on...");
        
        try{}
        finally{}
        catch(Exception e){}


x=-8
protected code 1
catch
finally
continuing on...

x=8
protected code 1
protected code 2
finally
continuing on...
*/
/*
        try{
            // Must throw an IOException here, otherwise the compiler 
            // will realise the catch blocks are "unreachable". If the
            // catch blocks were for RuntimeExceptions only, then I
            // could have an empty try{} block.
            throw new IOException();
        }catch(FileNotFoundException | EOFException e){
            // Identifier appears only once. These do NOT compile:
            //      }catch(FileNotFoundException e | EOFException e){
            //      }catch(FileNotFoundException e1 | EOFException e2){
            // Exceptions must be siblings (no subclass relationship).
            //   This fails to compile:
            //      }catch(FileNotFoundException | IOException e){
        }catch(IOException ioe){}

*/

/*
        try{
            throw new IOException();
        }catch(FileNotFoundException fnfe){
            // The order of the catch blocks is NB - proceed from
            // the most specific to the least specific.
            // Note: swallowing of exceptions is bad practice!
            System.out.println("FNFE");
        }catch(IOException fnfe){
            // swallowing exceptions is bad practice!
            System.out.println("IOE");
        }
        // catch(EOFException eofe){} // does not compile!

*/

/*
    public static void main(String[] args) {
        
        try{
            spillTea();
            System.out.println("Will never get here!");
        }catch(RuntimeException rte){
            getAnotherCup();
        }
        enjoyRestOfVideo();
    }
    public static void spillTea(){
        System.out.println("Spilling tea... ");
        throw new RuntimeException();
    }
    public static void getAnotherCup(){
        System.out.println("Getting another cup");
    }
    public static void enjoyRestOfVideo(){
        System.out.println("Enjoying rest of video...");
    }

*/
