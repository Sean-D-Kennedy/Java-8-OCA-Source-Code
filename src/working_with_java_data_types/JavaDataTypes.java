package working_with_java_data_types;

public class JavaDataTypes {
    public static void main(String[] args) {
//        primitives();
//        wrappers();
        operators();
    }
    public static void primitives(){
        short s = 3;
//        char c = 'a';   // chars in single quotes (Unicode 97) 
//        int i1 = c;     // automatic widening, char into int
//        float f = 23;   // int into float
//        double d = 2.3f;// float into double
//        float f1 = 1L;  // long promoted to float
//      
//        int i2   = (int)3.3;    // double cast to int
//        byte b1  = (byte)120;   // cast not actually needed
//        byte b2  = 120;         // compiler "knows" int literal is in range
//        float f1 = 3.45;        // double to float
//        float f2 = (float)3.45; 

//        long ll = 2L & 3L;
//        
//        char c1 = (short)98;    // 'b' 
//        System.out.println(c1); // b
//        short s1 = 'a'; // 97 is in range of short
//        char c = 'a';   // chars in single quotes (Unicode 97) 
////        short s2 = c;   // does not work with a variable (unless c is a 
//                        // compile-time constant)
//
//        final char c2  = 'a';// c2 is "final" i.e. a compile-time constant 
//        short s3 = c2;       // compiler can plug in the value now as it will
                             // never be changing


//        int x  = 42;            // decimal, base 10
//        System.out.println(x);  // 42
//
//        int b1 = 0b101010;      // binary: 32 + 8 + 2
//        System.out.println(b1); // 42
//
//        int o1 = 052;           // octal: 40 (5 * 8) + 2 (2 * 1) 
//        System.out.println(o1); // 42
//        
//        int h1 = 0x2a;          // hex: 32 (2 * 16) + 10 (10 * 1)
//        System.out.println(h1); // 42
//        
//        double d1 = 123_000.45;  // ok, aids readability
//        double d2 = _123_000.45; // underscore cannot be at very start/end
//        double d3 = 123_000_.45; // underscore cannot be either side of 
//                                 // decimal point
        
    }
    public static void wrappers(){
        
        // parseXXX(String)
        int i2 = Integer.parseInt("33"); // parseInt returns an int        
        double d = Double.parseDouble("2.3");
        float f = Float.parseFloat("4.4");

        // valueOf() preferred to using constructors (memory)
        Integer iw = Integer.valueOf(2); // better than using constructor
        Integer iw2 = Integer.valueOf("22");// overloaded
        Integer iw3 = Integer.valueOf("F", 16); // "F" treated as hex (base 16)
        System.out.println(iw3);// 15

        // boxing/unboxing
        Integer x = 3; // auto-boxing
        int i = Integer.valueOf(3); // auto-unboxing

        // valueOf() uses cached values
        Integer i3 = Integer.valueOf(500);
        Integer i4 = Integer.valueOf(500);
        System.out.println(i3 == i4);// false
        i3 = Integer.valueOf(100);// range of -128..+127, cached
        i4 = Integer.valueOf(100);// range of -128..+127, cached
        System.out.println(i3 == i4);// true
    }
    public static void operators(){
//        Integer i1 = Integer.valueOf("11");
//        Integer i2 = Integer.valueOf("5");
//        Integer i3 = i1 + i2; // adding primitives => unboxing (*2) and boxing (*1)
//        
//        int x=10, y=3;
//        int div = x/y;  // integer division truncates
//        int mod = x%y;  // keep remainder only
//        System.out.println(div + " " + mod);// 3 1
//        System.out.println(0 % 3);// 0
        
        
//            int res = 3 + 2 * 4;
//            System.out.println(res);// 11
//            res = (3 + 2) * 4;
//            System.out.println(res);// 20
//            res = 6 + 4 - 2;
//            System.out.println(res);// 8
//            res = 10 / 4 * 6;
//            System.out.println(res);// 12

//            int a=3, b=2;
//            int res = a+b;
//            System.out.println(res); // 5
//            String s="abc";
//            String s1 = a + s;
//            String s2 = s + a;
//            System.out.println(s1 + " " + s2); // 3abc abc3
//            
//            System.out.println("Output is "+ a + b);// Output is 32
//            System.out.println("Output is "+ (a + b));// Output is 5

//        int x=3, y=4;
//        x++;    // x is 4
//        --y;    // y is 3
//        System.out.println(x + " " + y);// 4 3        
//        System.out.println(x++ + " " + --y);// 4 2
//        System.out.println(x + " " + y);// 5 2

//        byte b1 = 2, b2 = 3;// compiler "knows" that the int literals
//                            // are in range => ok
//        byte b3 = 128;      // 128 is not in range (-128..+127)
//        
//        byte b4 = b1 + b2;  // must cast int to byte
//        byte b6 = (byte)(b1 + b2);// note the brackets
//
//        System.out.println(5.0 == 5); // true i.e. 5.0 == 5.0 (promotion)
//        System.out.println(5.1 == 5); // false i.e. 5.1 == 5.0 (promotion)
//        System.out.println(5.0 == 5L); // true i.e. 5.0 == 5.0 (promotion)

//        boolean b1 = false, b2 = true;
//        boolean res = b1 && (b2=false); // F &&
//        System.out.println(b1 + " " + b2 + " " + res); // false true false

//        boolean b1 = false, b2 = true;
//        boolean res = b2 || (b1=true); // T || 
//        System.out.println(b1 + " " + b2 + " " + res); // false true true
        
//        boolean b1 = false, b2 = true;
//        boolean res = b1 & (b2=false); // F & F
//        System.out.println(b1 + " " + b2 + " " + res); // false false false
        
        boolean b1 = false, b2 = true;
        boolean res = b2 | (b1=true); // T | T
        System.out.println(b1 + " " + b2 + " " + res); // true true true
        
//        byte b1 = 6 & 8;    // int operands, both must be on
//                            //      110 
//                            //   & 1000
//                            //     ====
//                            //     0000
//        byte b2 = 7 | 9;    // int operands, one or the other or both
//                            //      111 
//                            //   & 1001
//                            //     ====
//                            //     1111 (15)
//        byte b3 = 5 ^ 4;    // int operands, one or the other but not both
//                            //      101 
//                            //   &  100
//                            //     ====
//                            //      001
//        System.out.println(b1 + " " + b2 + " "+b3);// 0 15 1

//        boolean t=true, f=false;
//        System.out.println(t + " "+ !f);// true true
    
//        byte b1 = 2, b2 = 3;
//        byte b4 = b1 += b2; // a) b1 = (byte) (b1 + b2), implicit cast
//                            // b) b4 = b1;
//        System.out.println(b1 + " " + b2 + " "+b4);// 5 3 5
        
//        byte b1=3;
//        int i1 = 4;
//        b1 = b1 + i1;// byte = int ERROR!
//        
//        b1+=i1; // no error => b1 = (byte)(b1 + i1);

//        int x =2;
//        
//        // tricky - bearing in mind that * has higher precedence than +
//        // The expression on the RHS is always placed in parentheses and
//        // therefore the expression evaluates as x = x * (RHS)
//        x *= 2 + 5; // x = (x * 2) + 5 == 9
//                    // x = x * (2 + 5) == 14 (the correct one)
//        System.out.println(x);// 14

//        boolean b1 = (5 > 1)  ^ (10 < 20); // T ^ T == F
//        boolean b2 = (5 > 10) ^ (10 < 20); // F ^ T == T
//        System.out.println(b1 + " "+ b2);  // false true 
              
        int k = 1;
        // operand += operand (+= is the operator)
        // k = k + (RHS) i.e. k value of 1 will be used regardless of RHS
        // k = 1 + ( (k = 4) * (k + 2) )
        // k = 1 + ( 4 * 6) 
        // k = 1 + 24
        // k = 25
        k += (k = 4) * (k + 2); 
        System.out.println(k);  // 25
        
        // unary operators (one operand)
//        int x = +6; // positive is the default
//        int y = -x;
//        System.out.println(x + " " + y); // 6 -6
//        
//        int z = (int)3.45;
//        System.out.println(z); // 3
//        
//        boolean b = true;
//        System.out.println(!b); // false

        // asignment is the = and "equal to" is the ==
        int x=8, y=9;               
        System.out.println(x == y); // false 
        System.out.println(x != y); // true 
    }
}
