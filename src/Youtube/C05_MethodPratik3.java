package Youtube;

public class C05_MethodPratik3 {
    public static void main(String[] args) {
        int [] sayilar={20,30,40,50};
        kontrol(sayilar,30);
        int [] sayilar2={120,230,340,50};
        int arananSayi=40;
        kontrol(sayilar,arananSayi);
        kontrol(sayilar2,arananSayi);

    }
    public static void kontrol(int [] array, int arananSayi){
        boolean varMI=false;
        for (int sayi :array) {
            if(sayi==arananSayi){
                varMI=true;
                break;

            }
        }
        System.out.println("Var mi? "+ varMI);
    }
}
