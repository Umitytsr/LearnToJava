package Gun30._01_StaticVariables._Ornek2;

public class Student {
    int id;
    String fullName;

    static int sayac=1;//

    //Eskisi
    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    //Mantıklı olan
    public Student(String fullName) {
        this.id = sayac++;
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
