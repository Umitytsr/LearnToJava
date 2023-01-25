package Gun33._01_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        YoneticiYeni yYonetici=new YoneticiYeni();
        yYonetici.zamYap();
        yYonetici.setTcNo("123456");
        yYonetici.bordroYazdir();

        System.out.println("yYonetici.getTcNo() = " + yYonetici.getTcNo());

        // ...
        // Diğer class'ın her özelliğini ve metodlarını alıp
        // kullanmaya INHERITANCE yani kalıtım yani miras alma denir
    }
}
