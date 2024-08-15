package lets_get_certified.assignments;

import java.io.IOException;

class Parent{
    void process() throws IOException{
        throw new IOException();
    }
}
class Child extends Parent{
    // compiler error - "process() in Child cannot override process() in Parent
    //                   overridden method does not throw NoSuchMethodException"
    // To fix:
    //   1. Change Parent::process() to throw NoSuchMethodException as well as IOException
    //   2. Change Parent::process() to throw Exception only (this catches all subclasses)
    //   3. Make Child::process() throw IOException only
      @Override
      void process() throws RuntimeException{
          System.out.println("B");
      }
}    

public class ExceptionHandling {
    public static void main(String[] args) {
//            System.out.println(a());
//            System.out.println(b());
//            System.out.println(c());
//            System.out.println(d());

        Parent p = new Child();
        try {
            //the exceptions caught here are defined at compile time by
            //the type of 'p' i.e. 'Parent'
            p.process();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static String a(){
        // 'finally' block is ALWAYS executed.
        try{
        } catch(Exception e){
            System.out.println("Exception occured");
            return "exception";
        }finally{
            System.out.println("finally section...");
            return "finally";
        }
    }
    public static String b(){
        try{
            // return from try block
            return "ok";        // "finally section..." is printed
        } catch(Exception e){
            System.out.println("Exception occured");
            return "exception";
        }finally{
            System.out.println("finally section...");
            return "finally"; // if present, "ok" is replaced as the return String
        }
    }
    public static String c(){
        try{
            throw new Exception();  // BAD CODING - throwing an exception when there is no error!
        } catch(Exception e){
            System.out.println("Exception occured");
            return "exception";
        }finally{
            System.out.println("finally section...");
            return "finally"; // if present, "exception" is replaced as the return String
        }
    }    
    public static String d(){
        try{
            return "ok";
//        } catch(IOException e){ // error "never thrown in try block..."
//        } catch(NoSuchMethodException e){ // error "never thrown in try block..."
//        } catch(ClassNotFoundException e){ // error "never thrown in try block..."

        } catch(Exception e){  //ok
//        } catch(RuntimeException e){  //ok
            System.out.println("Exception occured");
            return "IOException";
        }
    }
}