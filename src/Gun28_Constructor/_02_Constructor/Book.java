package Gun28_Constructor._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(String name1,int publishYear1, String author1) {
        this.name = name1;
        this.publishYear = publishYear1;
        this.author = author1;
    }

    public Book (String name1,int publishYear1){
        this(name1,publishYear1,"");
    }

    public Book(){
        this("",0,"");
    }

    public String toString(){
        return name+" "+publishYear+" "+author;
    }

}



