package lets_get_certified.java_ooa.interfaces;

public interface TestDefault {
    int m0(); // ok, regular abstract method
    default int m1() {return 4;} // ok
    public default void m2() {}  // ok, public by default
    
    // default and static not allowed together
//    default static void m3(){}
    
    // missing method body i.e. {}
//    public default void m6();

    // default expects a method body, abstract does not
//    default abstract void m7();
}



