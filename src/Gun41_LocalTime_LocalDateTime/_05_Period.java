package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasında ki farkı gösterir
        // Sadece LocalDate'ler için


        LocalDate dogumTarihi=LocalDate.of(1998,11,7);
        LocalDate bugun=LocalDate.now();

        Period fark = Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println("\n************\n");

        Period period3Gun=Period.ofDays(3);
        Period period3Ay= Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);
        System.out.println("\n************\n");

        LocalDate ucGunSonra=bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);
        System.out.println("\n************\n");



        // Kursun bitiş tarihini bulunuz.

        Period period6Ay=Period.ofMonths(6);
        LocalDate kursBaslangic=LocalDate.of(2022,10,31);
        LocalDate kursBitis=kursBaslangic.plus(period6Ay);
        System.out.println("kursBitis = " + kursBitis);

        Period neKadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        Period simdiyeKadarGecenSure=Period.between(kursBaslangic,bugun);
        System.out.println("simdiyeKadarGecenSure = " + simdiyeKadarGecenSure);

    }
}
