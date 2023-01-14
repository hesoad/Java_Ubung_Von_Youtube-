package Youtube;

public class C01_parseIslemler {
    public static void main(String[] args) {

        int sayi1=50;
        byte sayi2=40;
        sayi2=(byte)sayi1;
        int maximSayi1=Integer.max(80,50);
        System.out.println(maximSayi1);

        String str= "50";
        int yasTamsayi=Integer.parseInt(str);
        System.out.println(yasTamsayi);

        String sonuc ="false";
        boolean sonucBoolean=Boolean.parseBoolean(sonuc);

        System.out.println(sonucBoolean);
        int strSayi=50;

        String yazi=String.valueOf(strSayi);
        System.out.println(yazi);




    }
}
