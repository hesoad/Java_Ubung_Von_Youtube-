package Youtube;

public class C06_MethodReturn {
    public static void main(String[] args) {
        bilgisGoster();
       int sonuc= toplam(20,40);
        System.out.println(sonuc);

    }
    public static void bilgisGoster(){
        System.out.println("Merhabalar");
        System.out.println("Hosgeldiniz");
    }
    public static int toplam(int sayi1,int sayi2){
        int toplam= sayi1+sayi2;

        return toplam;

    }
}
