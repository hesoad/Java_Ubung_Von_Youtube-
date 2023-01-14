package Youtube;

public class C04_MethodPratik2 {
    public static void main(String[] args) {

        int sayi1=25;
        int sayi2= 15;
        int sayi3=45;
        toplam(sayi1,sayi2);
        toplam(34,45,56);
    }
    public static void toplam(int sayi1, int sayi2){
        int toplam=0;
        toplam=sayi2+sayi1;
        System.out.println("1.method toplama sonucu="+toplam);
        toplam(45,25,56);
    }
    public static void toplam(int sayi1,int sayi2,int sayi3){
        int toplam=0;
        toplam=sayi2+sayi1+sayi3;
        System.out.println("2.method toplama="+toplam);

    }
}
