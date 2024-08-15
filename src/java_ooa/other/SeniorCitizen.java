package lets_get_certified.java_ooa.other;

import lets_get_certified.methods_and_encapsulation.Adult;

public class SeniorCitizen extends Adult{
    SeniorCitizen(String name, int age) {
        super(name, age);
    }
    void go(){
        address="Galway"; // protected
    }
}
