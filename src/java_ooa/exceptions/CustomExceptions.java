package java_ooa.exceptions;

//class BullInFieldException extends Exception{ // checked
//    BullInFieldException() {} // super(); inserted for us
//    BullInFieldException(Exception e) {
//        // wrapping another exception inside mine
//        super(e);
//    }     
//    BullInFieldException(String s) {
//        super(s);
//    }     
//} 
//
//public class CustomExceptions {
//    public static void main(String[] args) throws Exception{
////        throw new BullInFieldException();
////        throw new BullInFieldException("Run!");
//        throw new BullInFieldException(new RuntimeException("Walking in fields..."));
//    }
//    
//}

//  Hiding the original exception from the client
class DangerException extends Exception{}
class BullInFieldException extends DangerException{ } 
class BogHoleException extends DangerException{ } 

public class CustomExceptions {
    public static void main(String[] args){
        try{
            walk();           
        }catch (DangerException de){
            de.printStackTrace();
        }
    }
    public static void walk() throws DangerException{
        try{
            throw new BullInFieldException();
        }catch (BullInFieldException bife){
            // throw a DangerException
            throw new DangerException();
        }
    }
}