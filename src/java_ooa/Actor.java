package lets_get_certified.java_ooa;

public class Actor {
    private String name;
    private int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }    
    @Override
    public boolean equals(Object o){
        if(o instanceof Actor){
            // now it is safe to downcast
            Actor actor = (Actor)o;
            if(this.getAge() == actor.getAge() && this.getName().equals(actor.getName())){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 7;
    }
  
    public static void main(String[] args) {
        Actor actor1 = new Actor("John Bloggs", 25);
        Actor actor2 = new Actor("John Bloggs", 25);
        // == means are the references referring to the same object?
        System.out.println(actor1 == actor2); // false (different objects)
        
        // Object::equals() does the same as ==
        System.out.println(actor1.equals(actor2)); // false
    }
}
