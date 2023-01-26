package Gun09_If;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //girilen bir cümlede ki küçük veya büyük a harfinin olup
        //olmadığını VAR veya YOK şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz:");
        String cumle=oku.nextLine();
        String buyukKucuk=cumle.toLowerCase();

        if (buyukKucuk.indexOf("a") !=-1){
            System.out.println("VAR");
        }
        if (buyukKucuk.indexOf("a") ==-1){
            System.out.println("YOK");
        }


        //VEYA
        if (buyukKucuk.contains("a")==true){
            System.out.println("VAR");
        }
        if (buyukKucuk.contains("a")==false){
            System.out.println("YOK");
        }

        //VEYA
        if (buyukKucuk.contains("a")){
            System.out.println("VAR");
        }
        if (!buyukKucuk.contains("a")){
            System.out.println("YOK");
        }

    }
}
