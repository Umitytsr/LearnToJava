package Gun29_Erisimler._03_Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.adi="İsmet";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Ankara Hastanesi";
            //dok1.sicilNo -> private old. için ulaşılamıyo

        Doctor dok2=new Doctor("Mehmet");
    }
}
