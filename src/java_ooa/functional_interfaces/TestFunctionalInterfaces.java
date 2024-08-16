package java_ooa.functional_interfaces;

@FunctionalInterface
interface SampleFI{
    void m();// single abstract method (SAM)
}

@FunctionalInterface
interface SampleFI1{
    void m();           // SAM
    default void m1(){} // does not count
    static void m2(){}  // does not count
}

//@FunctionalInterface
interface SampleFI2{}   // no SAM, does not compile if annoytated with @FunctionalInterface

@FunctionalInterface
interface SampleFI3 extends SampleFI2{
    void m();           // SAM
}

//@FunctionalInterface
interface SampleFI4{
    void m1();      // abstract method
    void m2();      // abstract method
}

@FunctionalInterface
interface SampleFI5{
    void m();
    // the exception to the SAM rule
    public abstract String toString(); // does not count
    public boolean equals(Object o); // does not count
    int hashCode(); // does not count
}

public class TestFunctionalInterfaces  implements SampleFI5{
    public void m(){
        TestFunctionalInterfaces tfi  = new TestFunctionalInterfaces();
        TestFunctionalInterfaces tfi2 = new TestFunctionalInterfaces();
        System.out.println(tfi.toString());
        System.out.println(tfi.hashCode());
        System.out.println(tfi.equals(tfi2));
    }
    public static void main(String[] args) {
        new TestFunctionalInterfaces().m();
    }
}
