package Gun41_LocalTime_LocalDateTime;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);


        boolean sonraMi = bugun.isAfter(dun); // bugün dünden sonra mı?
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi = bugun.isBefore(dun); // bugün dünden önce mi?
        System.out.println("onceMi = " + onceMi);

        boolean esitMi = bugun.isEqual(dun);  // bugün düne eşit mi?
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi = bugun.isLeapYear(); // bu yıl artık yıl mı?
        System.out.println("artikYilMi = " + artikYilMi);



    }
}
