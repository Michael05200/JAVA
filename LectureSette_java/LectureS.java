public class LectureS{
    public static void main(String[] args){
        // dobbiamo calcolare
        AddOn AddUno = new AddOn(5, 10);
        int sommaFinale = AddUno.CalcolaSomma();
        System.out.println("il valore finale è questo:"+sommaFinale);
    }
}



class Calcolatrice{
    private int numA;
    private int numB;

    public Calcolatrice(int a, int b){
        setCalcolatrice(a, b);
    }

    private void setCalcolatrice(int x, int y){
        this.numA = x;
        this.numB = y;
    }

    public int getNumeratorA(){
        return numA;
    }
    public int getNumeratorB(){
        return numB;
    }

    protected int CalcolaSomma(){
        int somma;
        somma = numA + numB;
        return somma;
    }
}


class AddOn extends Calcolatrice{
    private final int correlation = 4;

    public AddOn(int x, int y){
        super(x, y);
    }

    @Override 
    public int CalcolaSomma(){
        int somma;
        somma = getNumeratorA() + getNumeratorB() + correlation;
        return somma;
    }
}