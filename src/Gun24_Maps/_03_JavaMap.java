package Gun24_Map;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasını iki kişi için yapınız

        HashMap<String,String> uKartvizit=new HashMap<>();
        uKartvizit.put("İsim","Uğur Yılmaz");
        uKartvizit.put("eMail","ugur@gmail.com");
        uKartvizit.put("Adres","Çekmeköy/İstanbul");
        uKartvizit.put("Telefon","05056667788");

        System.out.println("uKartvizit.get(isim) = " + uKartvizit.get("İsim"));
        System.out.println("uKartvizit.get(Telefon) = " + uKartvizit.get("Telefon"));

        HashMap<String,String> aKartvizit=new HashMap<>();
        aKartvizit.put("İsim","Ayşe Bayrak");
        aKartvizit.put("eMail","ayse@gmail.com");
        aKartvizit.put("Adres","Şişli/İstanbul");
        aKartvizit.put("Telefon","05326667788");

        HashMap<String,HashMap<String,String>> kartvizitler=new HashMap<>();
        kartvizitler.put("Uğur",uKartvizit);
        kartvizitler.put("Ayşe",aKartvizit);

        System.out.println("kartvizitler.get(Uğur) = " + kartvizitler.get("Uğur"));
        System.out.println("kartvizitler.get(Ayşe) = " + kartvizitler.get("Ayşe"));

        //ayşe'nin adresi
        System.out.println("kartvizitler.get(Ayşe).get(Adres) = " + kartvizitler.get("Ayşe").get("Adres"));

        //sadece eMailler
        for (Map.Entry<String,HashMap<String,String>> kv:kartvizitler.entrySet()) {
            System.out.println("kv.getValue().get(eMail) = " + kv.getValue().get("eMail"));
        }

    }
}
