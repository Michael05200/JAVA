public class TestQuadrato {
    public static void main(String[] args){

        Quadrato q1 = new Quadrato(5);
        int valArea = q1.area();
        int per = q1.perimeter();
        System.out.println(valArea);
        System.out.println(per);

        Rettangolo r1 = new Rettangolo(2, 5);
        int valAreadue = r1.area();
        int perDue = r1.perimeter();
        System.out.println(valAreadue);
        System.out.println(perDue);
    }   
}
