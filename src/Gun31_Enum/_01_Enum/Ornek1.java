package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ay noya göre , ayın gün sayısını
        // veren programı yazınız
        int ayNo=5;

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31 GÜN"); break;

            case 2: System.out.println("28 GÜN"); break;

            case 4:
            case 6:
            case 9:
            case 11: System.out.println("30 GÜN"); break;
        }


        String ayAd="Mayıs";

        switch (ayAd) {
            case "Ocak":
            case "Mart":
            case "Mayıs":
            case "Temmuz":
            case "Ağustos":
            case "Ekim":
            case "Aralık": System.out.println("31 GÜN"); break;

            case "Şubat": System.out.println("28 GÜN"); break;

            case "Nisan":
            case "Haziran":
            case "Eylül":
            case "Kasım": System.out.println("30 GÜN"); break;
        }

        // Bu iki tip için de kontrol çok zor ve hata olasılığı çok yüksek
        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım

        // kontrol zor hataya açık
        // Boolean True 1,  False 0


//        Kullanıcı Tipi : Role :
//        Student,Teacher, Admin, Mentor
//
//        if (kullanici == Role.Student)
//        {
//
//        }
//        else
//        {
//
//        }

    }
}
