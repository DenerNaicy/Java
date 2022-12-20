package Form;

public class Konvector {

    private static double yuan = 8.55;
    private static double dollar = 61.20;
    private static double euro = 60.68;
    private static double belrub = 24.24;

    public static double convert(double r, String v){
        if(v == "yuan"){
            return r/yuan;
        }
        if(v == "belrub"){
            return r/belrub;
        }
        if(v == "euro"){
            return r/euro;
        }
        if(v == "dollar"){
            return r/dollar;
        }
        else{
            System.out.println("error");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("rub "+Konvector.convert(570, "belrub"));
    }
}
