package Youtube;

public class Ogrenciler {
    int mevcut=0;

    public  void kayitEkle(){
        System.out.println("Ogrenci Kayidi yapildi ");
        mevcut++;
    }
    public void kayitSil(){
        System.out.println("Ogrenci Kayidi silindi");
        mevcut--;
    }
}
