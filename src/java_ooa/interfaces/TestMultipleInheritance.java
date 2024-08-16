package java_ooa.interfaces;

interface A{
    default void foo(){System.out.println("A::foo");}
}
interface B{
    default void foo(){System.out.println("B::foo\n");}
}
public class TestMultipleInheritance implements A, B{
    @Override
    public void foo(){
        System.out.println("Class::foo");
        A.super.foo();      // A::foo
        B.super.foo();      // B::foo
    }
    public static void main(String[] args) {
        new TestMultipleInheritance().foo();
        ((A)new TestMultipleInheritance()).foo();
    }
}
