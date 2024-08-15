package lets_get_certified.assignments;

public abstract class Run implements Exercise{
    private double distanceKm;
    
    public Run(double distanceKm){
        this.distanceKm = distanceKm;
    }
    @Override
    public double distanceCovered(){
        return distanceKm;
    }
}
class Soccer extends Run implements BallSport{
    Soccer(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println("Soccer::moving()");
    }
}
class Sprint extends Run {
    Sprint(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println("Sprint::moving()");
    }
}
