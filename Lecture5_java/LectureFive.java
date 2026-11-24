public class LectureFive{
    public static void main(String[] args){
        Moneta monetaVentiCent = new Moneta(0.20);
        Moneta monetaUnCent = new Moneta(0.01);
        double a = monetaVentiCent.getValore();
        System.out.println(a);
        double b = monetaUnCent.getValore();
        System.out.println(b);

        // qua inizializzo la quantità di valori

        PortaMonete portaUno = new PortaMonete(8);
        int x = portaUno.getDimension();
        System.out.println(x);
        PortaMonete portaUndici = new PortaMonete(11);
        int y = portaUndici.getDimension();
        System.out.println(y);
        PortaMonete portaDieci = new PortaMonete(10);
        portaDieci.Aggiungi(a);
        portaDieci.CheckPorta();
    }
}


class Moneta{
    private double valore;

    public Moneta(double a){
        if(a > 0 && a < 3){
            this.setValue(a);
        }
        else{
            System.out.println("Non è stato indicato nessun valore");
        }
    }

    private void setValue(double x){
        this.valore = x;
        System.out.println("valore salvato");
    }

    public double getValore(){
        return valore;
    }
}



class PortaMonete{
    private int dim;
    private double[] contValori;
    private int empty = dim;

    public PortaMonete(int a){
        if( a > 0 && a <= 10){
            this.setDimension(a);
        }
        else{
            System.out.println("Non è un portamonete!");
        }
    }

    private void setDimension(int a){
        this.dim = a;
        this.contValori = new double[a];
        this.empty = a; 
    }

    public int getDimension(){
        return dim;
    }

    public void Aggiungi(double va){
        for(int i = 0; i < contValori.length; i++){
            if(contValori[i] == 0){
                System.out.println("Aggiungo la moneta al protafoglio");
                contValori[i] = va;
                empty--;
                break;
            }
            else{
                System.out.println("Il portafoglio è pieno");
            }
        }
    }

    public void CheckPorta(){
        for(double v : contValori){
             System.out.println(v);
        }
        System.out.println("posti per le monete rimanenti:" + empty);
    }
}