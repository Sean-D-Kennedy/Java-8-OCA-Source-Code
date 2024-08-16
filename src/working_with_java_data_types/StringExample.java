package working_with_java_data_types;

public class StringExample {
    public static void main(String[] args) {
//        refsVersusObjects();
//        substring();
//        chaining();
        equalityAndStringPool();
    }
    public static void equalityAndStringPool(){
        
        String name1 = "Sean";
        String name2 = "Sean";
        // are the references the same?
        System.out.println(name1 == name2);//true
        
        String name3 = new String("Sean");
        System.out.println(name1 == name3);//false    
        // are the object contents the same?
        System.out.println(name1.equals(name3));//true
        String name4 = new String("Sean").intern();
        System.out.println(name1 == name4);//true
    
    }
    public static void chaining(){
        
        String s = "qwe"
                    .concat("rty")
                    .toUpperCase()
                    .replace('E', 'O');
        System.out.println(s); // QWORTY
    }
    public static void refsVersusObjects(){
        String s1 = "abc";
        String s2 = s1; // both references refer
                        // to the one object
        s1 = s1.concat("def");
        System.out.println(s1+" "+s2);// abcdef abc
        
        String s3 = "Java";
        s3.concat(" 11 Certification");
        System.out.println(s3);// Java
    }
    public static void substring(){
        
    }
    
}
