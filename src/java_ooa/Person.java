package lets_get_certified.java_ooa;
public final class Person {
    // instance fields are final and private - can only be assigned once 
    // (at construction time) – "blank finals"
    private final String name;	// blank final	
    private final int age;	// blank final

    // parameters are final - don't want to accidentally change them
    public Person(final String name, final int age) {
//        name = "abc";
//        age = 9;
        this.name = name;
        this.age = age;
    }
    // no setter methods i.e. state cannot be changed after construction
    public String getName() { 
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
	Person p1 = new Person("Joe Bloggs", 23);
	System.out.println(p1);
	Person p2 = new Person("Mary Bloggs", 24);
	System.out.println(p2);
        p1 = new Person("Alan Bloggs", 22);
    }
}

//class SportsPerson extends Person{}











//// Learning Outcomes:
////  1. Scope
////  2. Classes, fields, methods
////      - instance, static, overloaded methods, constructors
////      - encapsulation
////      - 'this' reference 
////  3. Object creation, garbage collection.
//package lets_get_certified.java_ooa;
//
//public class Person {
//    private int age;            // instance variable
//    private String name;        // instance variable
//    private static int count;   // class variable
//    public Person() {      Person.count++;}
//    public Person(String name, int age) { // overloaded constructor
//        this.name = name; // parameters 'hide' the instance vars => use 'this'
//        this.age = age; 
//        Person.count++;
//    }
//    public int getAge() {        return age;}
//    public void setAge(int age) {  this.age = age;    }
//    public String getName() {        return name;}
//    public void setName(String name) { this.name = name;}
//    public static int getCount() {       return count;}
//}
//class TestPerson{
//    public static void main(String[] args) {
//        Person john = new Person("Seán", 43);
//        Person mary = new Person();
//        mary.name = "Mary"; 
//        mary.setName("Mary");
//        mary.setAge(25);
//        System.out.println(Person.getCount());// 2
//        System.out.println(name);
//        String name="Paul"; 
//        System.out.println(name);
//    }    
//}
//
//
//
//
//
///*
//// Learning Outcomes:
////  1. Scope
////  2. Classes, fields, methods
////      - instance, static, overloaded constructors (methods)
////      - encapsulation
////      - 'this' reference 
////  3. Object creation, garbage collection.
//public class Person {
//    private int age;            // instance variable
//    private String name;        // instance variable
//    private static int count;   // class variable
//
//    // a constructor is a method which has:
//    //   1. the same name as the class
//    //   2. no return type
//    public Person() {
//        Person.count++;
//    }
//    public Person(String name, int age) { // overloaded constructor
//        this.name = name; // parameters 'hide' the instance vars => use 'this'
//        this.age = age; 
//        Person.count++;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {  // age is a local variable
//        this.age = age;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) { // name is a local variable
//        this.name = name;
//    }
//    public static int getCount() {
//        return count;
//    }
//}
//
//class TestPerson{
//    public static void main(String[] args) {
//        Person sean = new Person("Seán Kennedy", 43);// :) using the 2 overloaded constructors
//        Person mary = new Person();
////        mary.name = "Mary"; // encapsulation - name is private
//        mary.setName("Mary");
//        mary.setAge(25);
//        System.out.println(Person.getCount());// 2
//
//        System.out.println(name);
//        { { } }
//        String name="Paul"; // local variable 
//        System.out.println(name);
//    }
//    
//}
//
//
//
//*/
