package java_ooa.interfaces;

interface Restable{
    void rest();
}
abstract class Sport{
    abstract void play();
}
public class TestAnonymousInnerClasses {
    public static void main(String[] args) {
        // class TestAnonymousInnerClasses$1 implements Restable{
        //    public void rest(){
        //        System.out.println("rest");
        //    }
        // }
        Restable r = new Restable(){
            @Override
            public void rest(){
                System.out.println("rest");
            }
        };

        // class TestAnonymousInnerClasses$2 extends Sport{
        //    void play(){
        //        System.out.println("play");
        //    }
        // }
        Sport s = new Sport(){
            @Override
            void play(){
                System.out.println("play");
            }
        };
        r.rest();// rest
        s.play();// play
        
        new TestAnonymousInnerClasses().activity(new Sport(){
            @Override
            void play(){
                System.out.println("play");
            }
        });
    }
    
    public void activity(Sport s){
        s.play();// play
    }
}
