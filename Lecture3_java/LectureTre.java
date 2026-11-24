
public class LectureTre {
    public static void main(String[] args){
        int[] a = {10, 8, 4, 2, 12, 9, 24};
        Ver prova = new Ver(a);
        int reults = prova.compiler();

        if (reults == 5){
            System.out.println("il risultato finale è di 5");
        }
        else{
            System.out.println("nessuna corrispondenza trovata");
        }
    }
}



class Ver{
    public int[] x;
    public int counter = 0;
    public Ver(int[] y){
        x = y;
    }

    public int compiler(){
        
        while(true){
            int i = 0;

            if(x[i]%2 == 0){
                counter++;
            }
            if(counter == 5){
                break;
            }
            else{
                continue;
            }
        }

        return counter;
    }
}