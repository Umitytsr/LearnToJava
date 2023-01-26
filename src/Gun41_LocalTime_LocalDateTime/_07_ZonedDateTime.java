package Gun41_LocalTime_LocalDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {
        // Başka Bölgelerin Zaman (Time Zone) bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        // Şuan windows'un(benim) bulunduğum zamanı verdi

        System.out.println("zdt = " + zdt);
        System.out.println("\n***********\n");

        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();
        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("berlin")){
                System.out.println("z = " + z);
            }
        }

        ZoneId zoneIdBerlin=ZoneId.of("Europe/Berlin");
        ZonedDateTime zoneBerlin=ZonedDateTime.now(zoneIdBerlin);

        System.out.println("zoneBerlin = " + zoneBerlin);
        System.out.println("\n***********\n");





    }
}
