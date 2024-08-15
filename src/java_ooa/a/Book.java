package lets_get_certified.java_ooa.a;

public class Book {
    protected void read(){}
}
class NonFictionBook extends Book{
    public void doThings(){
        read(); // same package; no problem
    }
}
