package java_ooa.exceptions;

import java.io.IOException;

public class ComplexExample {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("1");
                // need an 'if' here, otherwise line S.o.p("2") is unreachable
                if(true) throw new ArrayIndexOutOfBoundsException();
                System.out.println("2");
            }catch(ArrayIndexOutOfBoundsException aioube){
                System.out.println("3");
                throw new RuntimeException();
            }finally{
                // RuntimeException is unhandled at this point.
                System.out.println("4");
                throw new IOException();
            }
        }catch(Exception e){
            System.out.println("6");
            System.out.println(e);// java.io.IOException
        }
    }
}


//            System.out.println(e.getSuppressed()[0]);

/*
package lets_get_certified.java_ooa.exceptions;

import java.io.IOException;

public class ComplexExample {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("1");
                // need an 'if' here, otherwise line S.o.p("2") is unreachable
                if(true) throw new ArrayIndexOutOfBoundsException();
                System.out.println("2");
            }catch(ArrayIndexOutOfBoundsException aioube){
                System.out.println("3");
                throw new RuntimeException();
            }finally{
                // RuntimeException is unhandled at this point.
                System.out.println("4");
              //  try{
                    throw new IOException();
              //  }catch(Exception e){
                    // this handler prevents the IOException from
                    // masking (losing) the RuntimeException
              //      System.out.println("5");
              //  }              
            }
        }catch(Exception e){
            System.out.println("6");
            System.out.println(e);// java.lang.RuntimeException
        }
    }
}


//            System.out.println(e.getSuppressed()[0]);

*/