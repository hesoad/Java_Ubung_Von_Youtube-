package Youtube;

public class C03_MethodPratik {
    public static void main(String[] args) {
        int num1=20;
        int num2=40;
        toplama(num1,num2);
        carpma(num1,num2);
        cikarma(num2,num1);
        bolme(num2,num1);


    }
  public static   void toplama(int sayi1,int sayi2){
        int toplam=sayi1+sayi2;
        System.out.println(toplam);

    }
    public static void cikarma(int sayi1,int sayi2 ){
        int fark=sayi1-sayi2;
        System.out.println(fark);
    }
    public static void carpma(int sayi1, int sayi2){
        int carpma= sayi1*sayi2;
        System.out.println(carpma);

    }
    public static void bolme(int sayi1, int sayi2){
        int bolme=sayi1/sayi2;
        System.out.println(bolme);
    }
}
