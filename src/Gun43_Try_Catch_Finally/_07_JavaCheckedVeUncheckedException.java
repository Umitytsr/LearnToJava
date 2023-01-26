package Gun43_Try_Catch_Finally;

public class _07_JavaCheckedVeUncheckedException {
    public static void main(String[] args) {
        // Checked ve Unchecked Exception
        // Java derki yazılımcının bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String str="";

        char ilkHarf=str.charAt(0); // sen bilirsin, ister try-catch kullan ister kullanma

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
