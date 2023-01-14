package Youtube;

public class C08_MethodPratiktFaktoryel {
    public static void main(String[] args) {
        int sayi=6;

         getfaktoryel(sayi);
        System.out.println(sayi+"'in faktoryeli="+ getfaktoryel(sayi));
    }

    private static int getfaktoryel(int sayi) {
        int sonuc=1;
        for (int i =sayi; i >=1; i--) {
            sonuc*=i;

        }
        return sonuc;
    }
}
