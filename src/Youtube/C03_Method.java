package Youtube;

public class C03_Method {
    public static void main(String[] args) {
        toplama();
        System.out.println("alt satir");
        toplama(20,30);
        toplama(30,30);
        toplama(240,30);


    }

    public static void toplama(){
        System.out.println("Toplama methodu cagrildi.");
        System.out.println("Merhabalar");

    }
    public static void toplama(int sayi1, int sayi2 ){
        int toplam=sayi1+sayi2;
        System.out.println(toplam);

    }

}
