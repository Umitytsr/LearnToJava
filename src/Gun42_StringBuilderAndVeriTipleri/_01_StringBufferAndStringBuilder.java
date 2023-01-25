package Gun42;

import javax.print.DocFlavor;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle = cumle + "Bugün"; // + işareti stringlerde birleştrime yapıyodu
        cumle = cumle + " hava";
        cumle += " çok soğuk";

        System.out.println("cumle = " + cumle); // "Bugün hava çok soğuk"
        System.out.println("cumle.concat() = " + cumle.concat(" fakat dün sıcaktı")); // "Bugün hava çok soğuk fakat dün sıcaktı"
        System.out.println("cumle = " + cumle); // "Bugün hava çok soğuk"
                                                // Cümleyi println içinde birleştirdiği ve eşitleme yapmadığı için
                                                // ana cümle aynı kaldı

        cumle = cumle.concat(" fakat dün sıcaktı"); // Burada eşitleme yaptığı için ana cümle değişti
        System.out.println("cumle = " + cumle); // "Bugün hava çok soğuk fakat dün sıcaktı"


        /************ StringBuilder ************/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugün"); // append : ekleme yapar, atama gerektirmez
        cumle2.append(" hava");
        cumle2.append(" soğuk");

        System.out.println("cumle2 = " + cumle2);

        /************ 3 modelin hızı konrtrol edilecek ************/

        long startTime=System.currentTimeMillis();

        // +
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1 += " merhaba";
        }
        System.out.println("+ için geçen süre = " + (System.currentTimeMillis()-startTime)+"ms");

        // concat
        startTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2 = test2.concat(" merhaba");
        }
        System.out.println("concat için geçen süre = " + (System.currentTimeMillis()-startTime)+"ms");

        // StringBuilder
        startTime=System.currentTimeMillis();

        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000 ; i++) {
            test3.append(" merhaba");
        }
        System.out.println("StringBuilder için geçen süre = " + (System.currentTimeMillis()-startTime)+"ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("******************\n\n");

        // StringBuilder'i daha yakından inceleyelim
        StringBuilder sb = new StringBuilder();
        sb.append("Bugün"); // kendine ekleme, atama gerktirmez(concat de gerektirir)
        sb.append(" hava");
        sb.append(" güzel");
        System.out.println("sb.length() = " + sb.length());

        sb.append(4); // eklenen her şeyi toString hali varsa çevirerek ekler.
        System.out.println("sb = " + sb);

        sb.reverse(); // String'i tersine çevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb); // düzelttim

        sb.delete(0,5); // (index)0 dahil, 5 hariç karakterleri siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece verilen indexte ki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime"); // Araya ekleme yapar, 5 nolu index'e 'kelime'yi ekler.
        System.out.println("sb = " + sb);

        sb = new StringBuilder("Bugün hava çok soğuk"); // Sıfırlandı ve ilk değer atandı
        System.out.println("sb = " + sb);

        sb.replace(3,8,"BU"); // Verilen aralığı bu string ile değiştirir.
        System.out.println("sb = " + sb);

        String strSb=sb.toString(); // Aslında bu StringBuilder'dı. String'e çevirdik.

        StringBuffer sBuffer = new StringBuffer(); // tamamen StringBuilder ile aynı
                                                   // tek farkı, paralel çalışan yazılımlarda bu kullanılır.

    }
}
