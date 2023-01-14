package Youtube;

public class C07_methodPratikt {
    public static void main(String[] args) {
       int sonuc1= toplama(20,40);
       int sonuc2=cikarma(40,30);
       int sonuc3=carpma(60,3);
       int sonuc4= bolme(60,3);
        System.out.println("Toplama sonucu="+ sonuc1);
        System.out.println("cikarma sonucu="+ sonuc2);
        System.out.println("carpma  sonucu="+ sonuc3);
        System.out.println("bolme  sonucu="+ sonuc4);
    }
    public static int  toplama (int sayi1 , int sayi2){
        int toplama= sayi1+sayi2;

        return toplama;
    }
    public static int cikarma (int sayi1, int sayi2){
        int fark= sayi1 -sayi2;

        return fark;
    }

    public static int  carpma (int sayi1, int sayi2){
        int carpma= sayi1*sayi2;

        return carpma;

    }
public static int bolme (int sayi1,int sayi2){
        int bolme = sayi1/sayi2;

        return bolme;
}
}
