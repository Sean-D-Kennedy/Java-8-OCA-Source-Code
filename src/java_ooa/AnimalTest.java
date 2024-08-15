package lets_get_certified.java_ooa;

class Animal{
    String name="Animal";
    public void eat(){System.out.println("Animal::eat()");}
    public static void walk(){System.out.println("Animal::walk()");}
}
class Dog extends Animal{
    String name="Dog";
    public void eat(){System.out.println("Dog::eat()");}
    public static void walk(){System.out.println("Dog::walk()");} // not an override! hiding.
    public void bark(){System.out.println("Dog::bark()");} // extra method
}
class AnimalTest {
    public static void main(String[] args) {
        Animal aa = new Animal();
        aa.eat();   // Animal::eat(), polymorphism -> object type
        Animal ad = new Dog();
        ad.eat();   // Dog::eat(), polymorphism -> object type
        System.out.println(ad.name);// Animal, data -> reference type
        ad.walk();  // Animal::walk(), static method -> reference type

//        Dog da = (Dog)new Animal();
        Dog dog = (Dog)aa;
//        Dog dog = (Dog)ad;
//        dog.bark();// Dog::bark()
    }
}

