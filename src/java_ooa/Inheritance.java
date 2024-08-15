package lets_get_certified.java_ooa;

class Vehicle extends Object{// a Vehicle is-an Object 
    public String toString(){ return "Vehicle"; }
}
class Car extends Vehicle{ // a Car is-a Vehicle
    public String toString(){ return "Car"; }
}
class Boat extends Vehicle{}    // a Boat is-a Vehicle
class Saloon extends Car{}      // a Saloon is-a Car, a Saloon is-a Vehicle 
class Convertible extends Car{} // a Convertible is-a Car, a Convertible is-a Vehicle 

public class Inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.toString());       // Vehicle
        Boat b = new Boat();
        System.out.println(b);                  // Vehicle
    }
}
