package Gun43_Try_Catch_Finally;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try {
            // hata olma olasığının olduğu kodlar
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }
        catch (Exception ex)
        {
            // hata olduğunda yapılacaklar
            System.out.println("catch bloğu çalıştı");
        }
        finally
        {
            // hata olsa da olmasa da çalışacak kısım, bu bölümün yukarıdaki
            // süreçle ilgili olduğunu göstermek için FINALLY içinde yazılır.
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
        }

        System.out.println("diğer çalışan kodlar");

        System.out.println("Program sonu");

    }
}
