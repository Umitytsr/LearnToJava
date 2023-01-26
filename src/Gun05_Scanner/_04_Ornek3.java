package Gun05_Scanner;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        //kullanıcıdan adını ve soyadını ayrı ayrı alıp birlikte okuyunuz

        Scanner adOku=new Scanner(System.in);
        System.out.print("Adınızı Giriniz:");
        String ad=adOku.next();

        Scanner soyadOku=new Scanner(System.in);
        System.out.print("Soyadınızı Giriniz:");
        String soyad=soyadOku.next();

        System.out.println("Ad Soyad:"+ad+" "+soyad);

        //veya

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız:");
        String ad2=oku.next();

        System.out.print("Soyadınız:");
        String soyad2=oku.next();

        System.out.println("AD SOYAD:"+ad2+" "+soyad2);

        //NOT!! Scanner'ı bir kez tanımlamamız yeterli
    }
}
