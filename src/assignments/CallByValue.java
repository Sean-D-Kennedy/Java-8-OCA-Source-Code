package assignments;

class Spectacles{
    private int numLenses;
    
    Spectacles(){
        numLenses=2;
    }
    public void setLenses(int aNumLenses){
        numLenses = aNumLenses;
    }
    public int getLenses(){
        return numLenses;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        // working with primitives
        int x=10;
        System.out.println("1. x before: "+x); //10
        passPrimitive(x);
        System.out.println("2. x after: "+x); // 10

        System.out.println();
        x = passPrimitiveAndReturn(x);
        System.out.println("3. x after: "+x); // 50
        
        //working with object references
        Spectacles specs = new Spectacles();
        System.out.println();
        System.out.println("4. lenses before: "+specs.getLenses()); // 2
        passObjectReference(specs);
        System.out.println("5. lenses after: "+specs.getLenses()); // 1
   
    }
    /* Java is call-by-value i.e. x copy is made.
    When the arguments are primitives, x copy of the
    primitive is made (photocopy)*/
    public static void passPrimitive(int x){
        x=50;
    }
    public static int passPrimitiveAndReturn(int x){
        x=50;
        return x;
    }
    
    public static void passObjectReference(Spectacles specs){
        specs.setLenses(1);
    }
    
}
