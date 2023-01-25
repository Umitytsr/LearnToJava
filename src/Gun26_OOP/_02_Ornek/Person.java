package Gun26._02_Ornek;

public class Person {
    String name;
    String surName;
    int age;

    public void bilgiYazdir(){
        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("age = " + age);
    }

    public String toString() {
        return name+" "+surName+" "+age;
    }

    public  void getBirthYear(){
        int dogumYili=2022-age;
        System.out.println("Doğum yılı: "+name+" "+dogumYili);
    }

    public String getBirthYear2(){
        return "doğum yılınız= " + (2022-age);
    }

    public void getInitials(){
        char isimBuyuk= name.toUpperCase().charAt(0);
        char soyadBuyuk= surName.toUpperCase().charAt(0);

        System.out.println("isim Soyisim Büyük:"+isimBuyuk+"."+soyadBuyuk);

        //veya
        System.out.println(name.toUpperCase().charAt(0) +"." +surName.toUpperCase().charAt(0));

    }
}
