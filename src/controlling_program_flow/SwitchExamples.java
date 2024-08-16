package controlling_program_flow;

public class SwitchExamples {
    public static void main(String[] args) {
//        switchExample1("Soccer");       // I play Soccer
//        switchExample1("Ice Hockey");   // I play Ice Hockey
//        switchExample1("Rugby");        // Unknown sport
        switchExample2();
        implicitCasting();
    }
    public static void switchExample1(String sport) {
        switch(1){} // valid

        switch(sport){
            default:// move around
                System.out.println("Unknown sport");
                break;
            case "Soccer":
                System.out.println("I play soccer");
                break;
            case "Ice Hockey":
                System.out.println("I play Ice Hockey");
                break;
        }
    }
    public static void switchExample2() {
        byte x = (byte)4; // byte => -128..+127
//        switch(x){
//            case -130:  // out of range
//            case 130:   // out of range
//        }
//        switch(x){
//            case 3:
//            case 3: // duplicate case label
//        }
        // This next switch statement outputs:
        //      4
        //      6
        //      Some other number
        Integer n = Integer.valueOf("4");
        switch(n){
            case 4: // entry point, keep going until "break"
                System.out.println("4");
            case 6: 
                System.out.println("6");
            default: 
                System.out.println("Some other number");
        }
    }
    public static void implicitCasting() {
        byte b=4;
        final int ic = 10;  // compile-time constant (value known at compile-time)
        int i = 10;         // not a constant
        final int c;        // not initialied at compile-time 
        c = 20;             //   - initialied at runtime
        Byte byteW = 30;    // Byte iw = new Byte(10);
        
        switch(b){//byte
            case 1+3:   // compile-time constant, int -> byte
            case ic:    // compile-time constant, int -> byte
//            case i:     // must be a compile time constant
//            case byteW: // must be a compile time constant
//            case c:     // must be a compile time constant
        }
    }
    
}
