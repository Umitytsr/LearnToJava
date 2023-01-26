package Gun41_LocalTime_LocalDateTime;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        // Canlı digital saat yapınız.

        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk.mm.ss");

        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\r"+"Saat : " + saat.format(f));
            MyFunc.bekle(1);
        }
    }
}
