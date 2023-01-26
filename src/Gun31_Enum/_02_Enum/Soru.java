package Gun31_Enum._02_Enum;

public class Soru {
    public static void main(String[] args) {
        // Bir User yetkilendirme modülü yapılması isteniyor.
        // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
        // USER STATUSU : AKTIF, PASIF
        // Yukarıdaki şekilde bir USER(username, rol, statu) class ı tanımlayınız
        // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
        // kullanıcısı tanımlayınız.
        // UserSilme isimli fonksiyona bu userları gönderiniz.
        // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

        User us1=new User("Ümit",Rol.ADMIN,Statu.AKTIF);
        User us2=new User("İsmet",Rol.SATIS,Statu.AKTIF);
        User us3=new User("Büşra",Rol.MUDUR,Statu.PASIF);

        //User class'ından çektim
        userSil(us1);
        userSil(us2);
        userSil(us3);

        //altta ki metoddan çektim
        userSil(us1);
        userSil(us2);
        userSil(us3);
    }

    public static void userSil(User user){
        if (user.role == Rol.ADMIN){
            System.out.println("Admin silinemez");
        }
    }
}
