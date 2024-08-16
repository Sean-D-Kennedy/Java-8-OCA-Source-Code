package java_basics;

public class Scope {
    // class and instance variables go here
    static int count;   // class 
    int x;              // instance
    
    public static void main(String[] args) {
        // local variables are method parameters and variables within methods
        int a=1;
        
        a=2;
        
        { // this is the start of the block of code
            a=3;
            int b=0;
            b++;
            {
                b++;
                a++;
            }
        } // this is the end of the block of code
//        b++; // out of scope and as a result, does not compile
        
        
    }
    
    public static void m1() {   // static
//    	a=4;
    }
    public void m2() {          // instance
//    	a=4;
    }
}
















/*
public class Scope {
    // class and instance variables go here
    private static Scanner sc = new Scanner(System.in);
    private int x=9; 
    
    //x = 92;
    
    {x=92;}
    
    public static void main(String[] args) {
        // local variables are method parameters and variables within methods
        int a=1;
        int x=0;// hiding
        System.out.println("x == " +x);// x == 0
        
        a=2;
        
        { // this is the start of the block of code
            a=3;
            int b=0;
            b++;
            {
                b++;
                a++;
            }
        } // this is the end of the block of code
        b++;
        
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.println("You entered "+a);
        
    }
    
    public static void m1() {   // static
    	a=4;
    }
    public void m2() {          // instance
    	a=4;
    }
}

*/