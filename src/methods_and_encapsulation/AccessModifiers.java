package methods_and_encapsulation;

public class AccessModifiers {
    public static void main(String[] args) {
        int age=20;
        Adult john = new Adult("John", age);
        change(john, age);
        System.out.println(john.getName() 
                + " " + age); // Michael 20
    }           
    
    public static void change(Adult adult, int age){
        age = 90;
        adult.setName("Michael");
    }
}





















class Horse{
    private String name;
    
    Horse(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}