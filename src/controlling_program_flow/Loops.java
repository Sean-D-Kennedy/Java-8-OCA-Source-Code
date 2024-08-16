package controlling_program_flow;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
      //  whileLoops();
      //  doWhileLoops();
      //basicForLoops();
      enhancedForLoops();
    }
    public static void enhancedForLoops(){
        
        String[] countries = new String[3];
        countries[0] = "Ireland";
        countries[1] = "United States";
        countries[2] = "Canada";
        
//        for(int country: countries){} // 'country' should be String
        
//        String name="";
//        for(String name:countries){ // 'name' already declared
//            System.out.println(name);
//        }

//        String player="Federer";
//        for(String p:player){}// array or Iterable on RHS

//        long[] la = {8L, 9L, 10L};
//        for(int n: la){} // 'n' needs to be long

        List<String> cars = new ArrayList<>();
        cars.add("Fiat");
        cars.add("Volvo");
        cars.add("Tesla");
        
        // enhanced-for version - using an Iterable
        for(String car:cars){
            System.out.println(car);
        }
        for(String car:cars){
            System.out.println(car);
        }


//        String[] cars = new String[3];
//        cars[0] = "Fiat";
//        cars[1] = "Volvo";
//        cars[2] = "Tesla";
//        
//        // traditional for loop
//        for(int i=0; i<cars.length; i++){
//            // don't really care about 'i'
//            System.out.println(cars[i]); 
//        }
//        // enhanced-for version
//        for(String car:cars){
//            System.out.println(car);
//        }
//        for(var car:cars){// var is ok too
//            System.out.println(car);
//        }
        
//        String carBrand="";
//        for(String carBrand:cars){ // 'carBrand' already declared
//            System.out.println(carBrand);
//        }
    }
    public static void basicForLoops(){
        
//        for(int i=1; i<=3; i++); // ok
//        
//        for(int i=1; i<=3; i++){
//            System.out.println(i);  // 1,2,3
//        } 
//        for(int i=3; i>=1; --i){
//            System.out.println(i);  // 3,2,1
//        } 
//        for(int i=0, j=0; i<1 && j<1; ++i, j++){
//            System.out.println(i + " " + j);  // 0 0
//        } 
        
//        for(int i=0; i<5; i--){}// infinite loop
//        
//        int i=0;
//        for(int i=0; i<5; i++){}// 'i' already declared 
//                                // in this scope
//                                
//        for(int j=0, short k=0; i<5 && j<5; i++, j++){} // mixed type
        
        // scope
        for(int i=0; i<5; i++){} // 'i' has scope of for loop
//        System.out.println(i);// out of scope!
        
        int counter=0;
        for(counter=3; counter>1; counter--){} // ok
        
    }
    public static void doWhileLoops(){
        
        int x = 3;
        
        do 
            System.out.println(x);  // 3 
        while( x > 99);
        
        do{
           System.out.println(x);   // 3, 2, 1
           --x;
        }while( x > 0);
        
//        do{
//            
//        }while(x > 0) // ; missing
                
        
    }
    public static void whileLoops(){
        
        int x = 0;
        
        while( x > 0)
            System.out.println("x > 0"); // not output
        
        while(x < 3){
            System.out.println(x); // 0,1,2
            x++;
        }

    }
    
}
