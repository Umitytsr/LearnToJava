package Gun03;
//Not= ctrl+alt+l satırları hizalar
public class _02_Degiskenler {
    public static void main(String[] args) {

        int sayi = 5;

        int kisaKenar = 5;
        int uzunKenar = 7;

        System.out.println(kisaKenar * uzunKenar); //alan
        System.out.println(2 * kisaKenar + 2 * uzunKenar);//çevre

        //veya

        int cevre;
        int alan;
        
        cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        alan=kisaKenar*uzunKenar;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
