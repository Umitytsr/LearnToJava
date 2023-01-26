package Gun12_Switch;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        //Kullanıcının girdiği bir gün numarasına karşılık gelen günü yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Gün no:");
        int gunNo=oku.nextInt();

        switch (gunNo){
            case 1: System.out.println("PAZARTESİ"); break; //break -> switch'den çık demek. eğer break yazmazsak
                                                            // seçilen satırladan sonra ki her şeyi yazacak
            case 2: System.out.println("SALI"); break;
            case 3: System.out.println("ÇARŞAMBA"); break;
            case 4: System.out.println("PERŞEMBE"); break;
            case 5: System.out.println("CUMA"); break;
            case 6: System.out.println("CUMARTESİ"); break;
            case 7: System.out.println("PAZAR"); break;
        }

        //NOT!! if'lerde tek değer olması durumunda, 2'den fazla if kullanman gerekiyorsa
        // SWITCH kullanmak daha mantıklı.
    }
}
