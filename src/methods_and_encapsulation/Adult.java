package methods_and_encapsulation;

public class Adult{
    private String name;
    private int age;
    protected String address;
    
    public Adult(String name, int age) {
        if(isAgeOk(age)){
            this.age = age;
            this.name = name;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(isAgeOk(age)){
            this.age = age;
        }else{
            throw new IllegalArgumentException();
        }
    }
    boolean isAgeOk(int age){ // package-private
        if(age >= 18){
            return true;
        }
        return false;
//        return age >= 18 ? true :false ; // ternary operator
    }
}
