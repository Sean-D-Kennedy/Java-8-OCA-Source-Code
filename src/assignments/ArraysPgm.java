package lets_get_certified.assignments;

public class ArraysPgm {
    
    public static void main(String[] args) {
        studentGrades();
    }
    
    public static void studentGrades(){
        int studentsGrades[][] =
            {
                {77, 68, 86}, // first students grades
                {96, 76, 45}  // second students grades
            };
//        outputGrades(studentsGrades);
        for(int[] studentGrades : studentsGrades){
            double average = calcAverage(studentGrades);
            System.out.println("Average is "+average);
            
            int minGrade = calcMinimumGrade(studentGrades);
            System.out.println("Minimum is "+minGrade);
            
            int maxGrade = calcMaximumGrade(studentGrades);
            System.out.println("Maximum is "+maxGrade);
        }
    }
    public static void outputGrades(int [][]studentsGrades){
        // enhanced for loop
        for(int[] studentGrades:studentsGrades){ // loop for the students
            for(int grade:studentGrades){  // loop for the grades for that student
                System.out.print(grade + " ");
            }
            System.out.println(); // goto next line/row
        }
        System.out.println(); 

        // traditional for loops
        // studentsGrades.length is the # of students (i.e. rows)
        //System.out.println(studentsGrades.length); // 2
        for(int row=0; row<studentsGrades.length; row++){ // loop for the students
            for(int col=0; col < studentsGrades[row].length; col++){  // loop for the grades for that student
                System.out.print(studentsGrades[row][col] + " ");
            }
            System.out.println(); // goto next line/row
        }
    }
    public static int calcMinimumGrade(int[] studentGrades){
        // row = {77, 68, 86} the first time
        // row = {96, 76, 45} the second time
        int lowGrade = 101;
        for(int grade:studentGrades){
            if(grade < lowGrade){
                lowGrade = grade;
            }
        }
        return lowGrade;
    }
    public static int calcMaximumGrade(int[] studentGrades){
        // row = {77, 68, 86} the first time
        // row = {96, 76, 45} the second time
        int highGrade = -1;
        for(int grade:studentGrades){
            if(grade > highGrade){
                highGrade = grade;
            }
        }
        return highGrade;
    }
    
    public static double calcAverage(int[] studentGrades){
        // row = {77, 68, 86} the first time
        // row = {96, 76, 45} the second time
        double sum=0.0;
        
        for(int grade:studentGrades){
            sum = sum + grade; // sum += grade;
        }
        return sum/studentGrades.length;
    }
}
