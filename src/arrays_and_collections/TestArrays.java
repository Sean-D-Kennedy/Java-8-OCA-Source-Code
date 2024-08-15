package lets_get_certified.arrays_and_collections;

class Book{
    private String theTitle;
    Book(String aTitle){
        theTitle = aTitle;
    }
}
public class TestArrays {
    public static void main(String[] args) {
        
        Book b = new Book("The Firm");
        Book[] myBooks = {b, new Book("A New Earth"), new Book("Sooley")};
        
        int [][]marks = { {3,1,7,6}, {2,3}, {6,5} };
        
        Book[][] myBooks2D = { 
            { new Book("The Firm"), new Book("A New Earth")},
            { new Book("Sooley"), new Book("Untamed")}
        };

        Book theFirm  = new Book("The Firm");
        Book newEarth = new Book("A New Earth");

        // As per 'Array reference assignments' the following lines do not compile.
//        myBooks2D    = new Book("The Firm"); // A
//        myBooks2D[1] = new Book("A New Earth");// B
//        myBooks2D[0][1] = myBooks2D[1];// C
        
    }
    
    
}
/*

class X{
    private Integer[] s={1,2,3,4};
}
{
    X[] array = new X[6];
    array[1]  = new X();
    array[2]  = new X();
    array[3]  = new X();
    array[3]  = null;
    // here
}

*/