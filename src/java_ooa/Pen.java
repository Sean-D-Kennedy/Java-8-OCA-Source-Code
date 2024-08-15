package lets_get_certified.java_ooa;

abstract class Pen {}// no abstract methods
abstract class Pencil{
    abstract void write(); // no {}
}
class DrawingPencil extends Pencil{
    void write(){}
    void erase(){}
}

class PenExample{
    public static void main(String[] args) {
//        Pen pen         = new Pen(); // cannot "new" a Pen (abstract)
        Pencil pencil   = new DrawingPencil();
//        pencil.erase();
        DrawingPencil dp = (DrawingPencil)pencil;
        dp.erase();
    }
}
