package Youtube;

import java.util.Arrays;

public class C02_Method {
    public static void main(String[] args) {

   /* }

    public static void toplama (){

    }
    public static void cikarma (){

    */

        int [] sayilar={10,20,30,40,50};
        int [] sayilar2={100,200,300,400,500};
        System.out.println(arrayToplam(new int[]{100, 200, 300, 400, 500}));
        System.out.println(arrayToplam(sayilar));
        /*
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        System.out.println(toplam);
        int toplam1=0;
        for (int sayi:sayilar2) {
            toplam1+=sayi;
        }
        System.out.println(toplam1);

       */

    }
    public static int arrayToplam(int [] sayilar ){
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }

     return toplam;
    }


}
