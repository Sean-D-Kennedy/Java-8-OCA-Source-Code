package lets_get_certified.java_ooa;

import java.util.ArrayList;

final class Department { // cannot subclass this class and all methods are final
    // private final instance variables
    private final String name, address; // String is immutable
    private final int numEmployees;
    private final ArrayList<String> employees;// mutable
    
    // private constructor - cannot subclass this class because this constructor 
    // cannot be invoked from a subclass (hidden)
    private Department(String name, String address, int numEmployees, ArrayList<String> employees){
        this.name           = name;
        this.address        = address;
        this.numEmployees   = numEmployees;
        this.employees      = new ArrayList<String>(employees); // create a new ArrayList
//        this.employees      = employees; // breaking encapsulation!
    }
    
    // factory method to create a Department
    public static Department createNewInstance(String name, String address, 
            int numEmployees, ArrayList<String> employees){
        return new Department(name, address, numEmployees, employees);
    }
    
    // no 'set' methods, only 'get' methods
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getNumEmployees(){
        return numEmployees;
    }
    public ArrayList<String> getEmployees(){
        return new ArrayList<String>(employees);  // return a new object
//        return employees;  // breaking encapsulation!
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", address=" + address + ", numEmployees=" + numEmployees + ", employees=" + employees + '}';
    }
    
}
 //1. The next line generates the error:
 //   - "compiler error: cannot inherit from Department" as Department is final
//class SportsDepartment extends Department{ 
//    SportsDepartment(){
//        // 2. The next line generates the error:
//        //    - Department constructor is not visible
//        super("", "", 2, new ArrayList<String>());
//    }
//}

public class TestImmutable {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ann");employees.add("Liam");
        
        Department dept = Department.createNewInstance("Argos", "Athlone", 2, employees);

        //Created: Department{name=Argos, address=Athlone, numEmployees=2, employees=[Ann, Liam]}
        System.out.println("Created: "+dept);
        
        String name      = dept.getName();
        String address   = dept.getAddress();
        int numEmployees = dept.getNumEmployees();
        employees        = dept.getEmployees();

        //Retrieved: Argos Athlone 2 [Ann, Liam]
        System.out.println("Retrieved: "+name+" "+address+ " "+numEmployees+ " "+employees);
        
        // change what I got back - any affect on the "dept" immutable object?
        name = "Boots";// Strings are immutable so new objects are created in the background => OK
        address = "Galway";
        numEmployees = 3; // simple primitive i.e. value is just copied back
        employees.add("Tom"); // as we only got a copy of the AL back; we are changing that copy        
        
        //Any change?: Department{name=Argos, address=Athlone, numEmployees=2, employees=[Ann, Liam]}
        System.out.println("Any change?: "+dept);
    }    
}
