package Gun09_If;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //girilen bir cümlede a harfinin geçip geçmediğini
        //bulunuz. geçiyorsa EVET, geçmiyorsa Hayır yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz:");
        String geciyoMu=oku.nextLine();
        int a=geciyoMu.indexOf("a");

        if (a>=0){
            System.out.println("EVET");
        }
        if (a<0){
            System.out.println("HAYIR");
        }

        //2.YOL
        Scanner oku2=new Scanner(System.in);
        System.out.print("Bir cümle giriniz:");
        String cumle=oku2.nextLine();

        if (cumle.contains("a")){
            System.out.println("EVET");
        }
        if (!cumle.contains("a")){
            System.out.println("HAYIR");
        }
        //NOT!! If'in içine üstteki gibi ! konulursa değil anlamına gelir.

        //3. YOL
        boolean varMi=cumle.contains("a");

        if (varMi==true){
            System.out.println("EVET");
        }
        if (varMi==false){
            System.out.println("HAYIR");
        }
    }
}
