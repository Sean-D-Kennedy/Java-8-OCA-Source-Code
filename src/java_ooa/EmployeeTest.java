package lets_get_certified.java_ooa;

class Employee {
    private int empId;  // Composition - "HAS-A" relationship
    private String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee ID:     " + empId + "\n" +
               "Employee Name:   " + name + "\n";    
    }
}
class Manager extends Employee {// a Manager "IS-A" Employee
    private String deptName;    // a Manager "HAS-A" department

    Manager(int empId, String name, String deptName) {
         // call parent constructor
        super(empId, name);
        this.deptName = deptName;
    }
    @Override
    public String toString() {
        // call the parent toString()
        return super.toString() + "\nDepartment:      " + deptName;
    }
}
class Director extends Manager {
    private double budget;

    Director(int empId, String name, String department, double budget) {
        super(empId, name, department);
        this.budget = budget;
    }
    @Override
    public String toString() {
        return super.toString() + "\nBudget:          " + budget;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Director dir = new Director(754, "Joe Bloggs", "Marketing", 1_000_000.00);
        System.out.println(dir);
    }
}
