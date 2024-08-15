package lets_get_certified.java_ooa;
class A{
   static{ System.out.println("static A1"); }       // 1a. static block
   {  System.out.println("instance A1"); }          //    2a. instance block
   public A() { }                                   //       3. constructors
   public A(int i) {   System.out.println(i +"\n");    }
   static{  System.out.println("static A2"); }      // 1b. static block
   {  System.out.println("instance A2"); }          //    2b. instance block
}
class B{
   static{ System.out.println("static B"); }        // 1a. static block
   static A s1 = new A(1);                          // 1b. static variable
   A a = new A(2);                                  //    2a. instance variable
   static A s2 = new A(4);                          // 1c. static variable
   { System.out.println("instance B"); }            //    2b. instance block
}
public class Q2_1170 {
   public static void main(String[] args){
      B b = new B();
      A a = new A(3);
   } 
}
/*
B b = new B();  ->  static{ System.out.println("static B"); }   ->  static B
                ->  static A s1 = new A(1);                     ->  static A1
                                                                    static A2
                                                                    instance A1
                                                                    instance A2
                                                                    1

                ->  static A s2 = new A(4);                     ->  instance A1
                                                                    instance A2
                                                                    4

                ->  A a = new A(2);                             ->  instance A1
                                                                    instance A2
                                                                    2

                ->  { System.out.println("instance B"); }       ->  instance B

A a = new A(3);                                                 ->  instance A1
                                                                    instance A2
                                                                    3
*/