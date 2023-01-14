package Youtube;

public class C10_MethodPratiktBuyuktenKucuge {
    public static void main(String[] args) {
        //parametre olarak gonderilen sayilarin
        // tumunu buyukten kucuge sirali olup olmadigini
        // boolean ile donduren bir method yazin


        int [] sayilar={100,90,80, 70, 60};

        getsiraliMI(sayilar);
        System.out.println("Sirali mi ? "+getsiraliMI(sayilar));

    }

    public static boolean getsiraliMI(int [] sayilar){
        boolean siraliMi=true;

        for (int i = 0; i < sayilar.length-1 ; i++) {
            if (sayilar[i]<sayilar[i+1]){
                siraliMi=false;
                break;
            }

    }
        return siraliMi;
    }
}
