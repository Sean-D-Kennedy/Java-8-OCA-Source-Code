package lets_get_certified.java_ooa;

// Chetan Patil - Only static variables/methods can be accessed as part of this([args]), 
//                I didnt understand this concept and there are no examples... requesting you upload more exaples..
class Chair{
    static int numLegs=4;   // initialised before any constructor is called
    boolean isFoldable=false;     // instance variable - initialised as part of object creation
    Chair(){
        // Remember, first line is (explicitly of implicitly) a call to super([...]) or this([...])

        // Compiler error: cannot reference 'isFoldable' before supertype constructor is called
        this(numLegs);
        boolean b = isFoldable;
    }
    Chair(int numLegs){
        super();
        this.numLegs = numLegs;
//        this.isFoldable = isFoldable;
    }
}
public class AccessingThisFromConstructor {
    public static void main(String[] args) {
        
    }
    
}
