// Quadrato and other class

public class Quadrato {
    public final int number_side = 4;
    public int p;
    public int a;
    public int length_side;
    
    public Quadrato(int a){
        length_side = a;
    }

    public int area(){
        a =  length_side * length_side;
        return a;
    }

    public int perimeter(){
        p = length_side * number_side;
        return p;
    }
}

class Rettangolo{
    public final int number_side = 2;
    public final int number_height = 2;
    public int a;
    public int p;
    public int length_side;
    public int length_height;

    public Rettangolo(int x, int y){
        length_side = x;
        length_height = y;
    }

    public int area(){
        a = length_height * length_side;
        return a;
    }

    public int perimeter(){
        p = (length_side *  number_side) + (length_height * number_height);
        return p;
    }
}
