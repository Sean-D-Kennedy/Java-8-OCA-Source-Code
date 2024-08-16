package methods_and_encapsulation;

public class SampleMethods {
    public static void main(String[] args) {
        int sum = performCalc(3, 4);// call; passing down arguments
        System.out.println(sum);
        sum = performCalc(5, 7); // call it again
        System.out.println(sum);
        sum = performCalc(2, 9);
        System.out.println(sum);

        // call the overloaded version
        double sumD = performCalc(5.0, 6.0);
        System.out.println(sumD);
    }
    public static int performCalc(int x, int y){//parameters
        int sum = x + y ;
        return sum;
    }
    // method overloading
    public static double performCalc(double x, double y){
        double sum = x + y;
        return sum;
    }
}
