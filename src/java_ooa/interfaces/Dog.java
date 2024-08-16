//package java_ooa.interfaces;
//
//interface Moveable{
//    String s="move";// constant - public static final
//    void move(); // public abstract
//}
//public class Dog implements Moveable{
//    // MUST be public - cannot assign weaker privileges
////    void move(){} 
//    @Override
//    public void move(){// MUST be public
//        System.out.println("Dog::move()");
//    }
//    public static void main(String[] args) {
////       s = "walk"; // cannot change a final variable
//       System.out.println(s);// move
//       // cannot refer to an instance member from a static context
////       move();
//       new Dog().move();// Dog::move()
//    }
//}
//
//
