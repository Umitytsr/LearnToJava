package Gun41_LocalTime_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumunda ki time veya tarih
        // bilgisini time veya tarih bilgisine çevilmesi

        long startTime = System.currentTimeMillis(); // kodun performansı

        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023)= ");
        String strTarih= oku.nextLine();

        // Kullanıcıdan gireceği formata göre format oluşturduk
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        // String'in formatını üstteki formata uyarlamak için parse ile çevirdik
        LocalDate tarih = LocalDate.parse(strTarih,f);
        System.out.println("tarih = " + tarih.format(f));

        long finishTime = System.currentTimeMillis();
        System.out.println("Geçen Süre= " +(finishTime-startTime)/1000+"ms");
    }
}
