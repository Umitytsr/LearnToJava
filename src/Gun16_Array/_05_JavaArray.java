package Gun16_Array;

public class _05_JavaArray {
    public static void main(String[] args) {
        //5 tv kanalı ismini bir diziye dolduruyoruz.
        //daha sonra random olarak bir tanesini seçip ekrana
        //seçileni yazdırınız.

        String[] kanal={"Trt","KanalD","Fox","Atv","StarTv"};
        int rndsayi=(int) (Math.random()*(5));
        System.out.println("Kanal="+kanal[rndsayi]);

    }
}
