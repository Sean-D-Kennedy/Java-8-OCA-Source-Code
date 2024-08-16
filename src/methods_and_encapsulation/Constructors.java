package methods_and_encapsulation;

class Dog{}
class Cat{
    Cat(){} // no-arg constructor
}
class Mouse{
    private String theName;
    
    Mouse(){
        theName = "";
    }
    Mouse(String aName){
        theName = aName;
    }
    void Mouse(){} // this is NOT a constructor!!
}
public class Constructors {
    public static void main(String[] args) {
        Dog d = new Dog(); // no error
        Cat c = new Cat(); 
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse("Nibbles");
    }
}
