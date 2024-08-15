package lets_get_certified.selected_clases_from_java_API;

import java.util.ArrayList;

class Person {
    private String name;
    Person(String name) {this.name = name;}
    public String getName(){return name;}
    @Override
    public String toString(){return name;}
    @Override
    public boolean equals(Object o){
        if (o instanceof Person){
            Person p = (Person)o;
            if(p.getName().equals(this.name))
                return true;
        }
        return false;
    }
}
public class TestArraysAndArrayLists {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Person[] peopleArray = {new Person("Alan"), new Person("Brian")};
        
        ArrayList<Person> peopleAL = new ArrayList<>();
        Person april = new Person("April");
        peopleAL.add(april);peopleAL.add(new Person("Beatrice"));
        peopleAL.add(new Person("Carol"));peopleAL.add(new Person("Deirdre"));
        peopleAL.add(new Person("Enda"));peopleAL.add(new Person("Frank"));
        peopleAL.add(new Person("Henry"));
        peopleAL.add(6,new Person("Gerard"));
        System.out.println(peopleAL);// [April, Beatrice, Carol, Deirdre, Enda, Frank, Gerard, Henry]
        Person p = peopleAL.get(1);
        System.out.println(p.getName()); // Beatrice
        System.out.println(peopleAL.contains(april));// true
        System.out.println(peopleAL.contains(new Person("Beatrice")));// true
        peopleAL.add(new Person("Carol")); // Carol now in ArrayList twice
        peopleAL.remove(new Person("Carol"));// first occurence of Carol removed
        System.out.println(peopleAL);// [April, Beatrice, Deirdre, Enda, Frank, Gerard, Henry, Carol]
        peopleAL.remove(0);// removes April
        System.out.println(peopleAL);// [Beatrice, Deirdre, Enda, Frank, Gerard, Henry, Carol]

        ArrayList<Integer> numbersAL = new ArrayList<>();
        numbersAL.add(Integer.valueOf(1000));
        numbersAL.add(1000); // same as above (Integer stored, not an int)
        System.out.println(numbersAL);// [1000, 1000]
    }
    
    
}
