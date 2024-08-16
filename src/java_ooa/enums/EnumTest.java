package java_ooa.enums;

//enum Direction extends Object{ // compiler error
enum Direction {
    NORTH, SOUTH, EAST, WEST;
}
public class EnumTest {
    public static void main(String[] args) {
//        Direction d = new Direction();// compiler error
//        Direction d = Direction.SOUTH_WEST; // type safety
        
        Direction d = Direction.WEST; 
        System.out.println(d == Direction.WEST);        // true
        System.out.println(d.equals(Direction.WEST));   // true
        switch(d){
            case WEST:
                System.out.println("West");
                break;
//            case Direction.WEST: // unqualified constant required
//            case 0: // cannot use an int
        }
//        if(Direction.WEST == 3){}// Direction vs int
        Direction d2 = Direction.valueOf("EAST");
        System.out.println(d2);// EAST
        
        for(Direction direction: Direction.values()){
            System.out.println(direction.ordinal() + ", "+ direction.name());
        }
        
    }
    
}
