package lets_get_certified.java_ooa.b;

import lets_get_certified.java_ooa.a.Book;

class FictionBook extends Book{
    public void doThings(){
        read();     // different package, via inheritance; no problem
        this.read();// different package, via inheritance; no problem
        FictionBook fb = new FictionBook(); // default ctor created for us
        fb.read();  // no problem
        
        // Here, I create an instance of the superclass that has the protected
        // member. Note that even though FictionBook has access via inheritance
        // to read(), FictionBook must access it properly.
        Book b = new Book();
//        b.read();   // not public!
    }
}
class SpaceFictionBook extends FictionBook{
    public void doThings(){
        read();     // different package, via inheritance; no problem
//        new Book().read();        // does not compile
//        new FictionBook().read(); // does not compile
        new SpaceFictionBook().read();// ok
    }
}
class Reader{
    public void doThings(){
        Book b = new Book();
//        b.read();   // fails to compile
        
        // can I access the protected member via the subclass that inherits it?
        FictionBook fb = new FictionBook(); 
//        fb.read(); // fails to compile
    }
}