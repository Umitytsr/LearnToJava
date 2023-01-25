package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100'e kadar olan sayıların toplamını bulunuz

        int sayac=1;
        int toplam=0;

        while (sayac<=100){
            toplam=sayac+toplam;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
