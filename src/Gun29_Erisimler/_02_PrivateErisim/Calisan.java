package Gun29_Erisimler._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surname;
    private String password;


    public void sifreAtama(String sifre){
        if (sifre.length()<8){
            System.out.println("Zayıf şifre");
        }else {
            this.password=sifre;
            System.out.println("Şifre başarıyla atandı");
        }
    }

    public void sifreGoster(){
        System.out.println("*****"+password.substring
                (password.length()-3));
    }

}
