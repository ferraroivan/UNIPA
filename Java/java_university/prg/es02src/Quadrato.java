package prg.es02;

public class Quadrato{
    public int side;

    public Quadrato(){
        side = 0;
    }
    public int perimetro(){
        return side * 4;
    }
    public int area(){
        return side * side;
    }

}
