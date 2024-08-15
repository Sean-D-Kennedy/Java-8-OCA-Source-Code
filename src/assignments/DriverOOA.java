package lets_get_certified.assignments;

import java.util.ArrayList;
import java.util.List;

public class DriverOOA {
    public static void main(String[] args) {
        List<Exercise> exercises = new ArrayList<>();
        
        Exercise soccer         = new Soccer(12.5);
        exercises.add(soccer);
        Exercise sprint         = new Sprint(.1);
        exercises.add(sprint);
        Exercise stroll         = new Stroll(10);
        exercises.add(stroll);
        Exercise raceWalking    = new RaceWalking(5);
        exercises.add(raceWalking);
        
        performExercises(exercises);
    }
    public static void performExercises(List<Exercise> exercises){
        for(Exercise exercise:exercises){
            if(exercise instanceof BallSport){
                System.out.println("BallSport: " + exercise.getClass().getSimpleName());
            }
            if(exercise instanceof OlympicSport){
                System.out.println("OlympicSport: " + exercise.getClass().getSimpleName());
            }
        }
    }
}
