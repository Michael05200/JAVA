public class estensione{
    public static int somma(int a, int b){
        int somma;
        somma = a + b;
        return somma;
    }
}



class Atleta{
    private String nome;
    private String Surname;
    private int age;
    private String sport;

    public Atleta(String a, String b, int c, String d){
        setData(a, b, c, d);
    }
    private void setData(String x, String y, int z, String w){
        this.nome = x;
        this.Surname = y;
        this.age = z;
        this.sport = w;
    }

    public String getNome(){
        return nome;
    }

    public String getSurname(){
        return Surname;
    }

    public int getAge(){
        return age;
    }

    public String getSport(){
        return sport;
    }
}




class canoista extends Atleta{
    private String role;

    public canoista(String a, String b, int w){
        super(a, b, w, "canoa");
        this.role = "canoista";
    }

    public canoista(String x, int y){
        super(x, "boss", y, "canoa");
        this.role = "canoa";
    }

    public String describe(){
        return "ciao" + getNome()+ getSurname() + "hai" + getAge() + "sei bravo come" + role;
    }
}