package prg.es02;

public class Rettangolo{
    public int width, heigth;

    public Rettangolo(){
        width = 0;
        heigth = 0;
    }

    public int area(){
        return width * heigth;
    }

    public int perimetro(){
        return (width + heigth)*2;
    }
}
