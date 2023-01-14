package Youtube;

public class MainOgrenciler {
    public static void main(String[] args) {
        //Bir tane ogrenciler adinda klass olusturun
        // ve icerisinde okuldaki ogrenci saysini gosteren bir degisken olsun
        // ve "KayitEkle ()"ve "Kayitsil ()" methodlar yardimiyla
        // bu ogrenci sayisi degiskenindeki sayiyi bir artirip bir azaltalim
        Ogrenciler ogrenci=new Ogrenciler();

        System.out.println("Ogrenci sayisi : "+ogrenci.mevcut);
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        ogrenci.kayitEkle();
        System.out.println("Ogrenci sayisi : "+ogrenci.mevcut);
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        ogrenci.kayitSil();
        System.out.println("Ogrenci sayisi : "+ogrenci.mevcut);


    }
}
