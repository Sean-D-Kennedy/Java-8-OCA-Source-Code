package assignments;

public abstract class Walk implements Exercise{
    private double distanceKm;
    
    public Walk(double distanceKm){
        this.distanceKm = distanceKm;
    }
    @Override
    public double distanceCovered(){
        return distanceKm;
    }
}
class Stroll extends Walk {
    Stroll(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println("Stroll::moving()");
    }
}
class RaceWalking extends Walk implements OlympicSport{
    RaceWalking(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println("RaceWalking::moving()");
    }
}
