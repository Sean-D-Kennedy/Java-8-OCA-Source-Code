package lets_get_certified.controlling_program_flow;

public class BreakContinue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        nestedLoops();
        //normalBreak();
        //normalContinue();
        //labelledBreak();
        //labelledContinue();
    }

    public static void nestedLoops() {
        /*      i, j
                ====
                1, 1
                1, 2
                1, 3
                1, 4
                1, 5
                2, 1
                2, 2
                2, 3
                2, 4
                2, 5
                3, 1
                3, 2
                3, 3
                3, 4
                3, 5 */
        System.out.println("i, j\n====");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void normalBreak() {
        /* 
            i, j
            ====
            1, 1
            1, 2
            2, 1
            2, 2
            3, 1
            3, 2 */
        System.out.println("i, j\n====");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break; // breaks out of inner loop
                }
                System.out.println(i + ", " + j);
            }
        }
    }
    public static void normalContinue() { // "j == 3" missing each time from inner loop
        /* Output:
            i, j
            ====
            1, 1
            1, 2
            1, 4
            1, 5
            2, 1
            2, 2
            2, 4
            2, 5
            3, 1
            3, 2
            3, 4
            3, 5 */

        System.out.println("i, j\n====");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue; // bypasses S.o.p and continues with inner loop
                }
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void labelledBreak() {   
        /*  i, j
            ====
            1, 1
            1, 2 */
        
        System.out.println("i, j\n===="); // placed BEFORE label!!
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break OUTERLOOP;// case sensitive, breaks out of OUTERLOOP
                }
                System.out.println(i + ", " + j);
            }
        }
        
        
        LOOP2:
        for (int i = 1; i <= 3; i++) {
            if(i==1){
                break LOOP2;
            }
        }
        
    }

    public static void labelledContinue() {
        // once j==3 in inner loop, control passes to next iteration of outer loop

        /* Output:
            i, j
            ====
            1, 1
            1, 2
            2, 1
            2, 2
            3, 1
            3, 2 */

        System.out.println("i, j\n===="); // placed BEFORE label!!
        OUTERLOOP:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue OUTERLOOP;// exits the inner loop and continues with OUTERLOOP
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}



/*
public class BreakContinue {
    public static void main(String[] args) {
        //nestedLoops();
    }
    public static void nestedLoops() {
        
        String[][] directions = 
            { {"North", "South"}, {"East", "West"} };
        // North    South	
        // East     West	
        for(String[] row:directions){// enhanced-for
            for(int i=0; i<row.length; i++){// traditional for
                System.out.print(row[i] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
*/