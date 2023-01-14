package Youtube;

public class C09_MethodPratiktArray {
    // bir tamsayilar arrayinin icerisindeki en buyuk saayiyi bulan bir method olusturunuz.
    //method elde ettiginiz sonucu return etsin
    public static void main(String[] args) {
        int [] array={1200,42,55,20,2212};
        int [] array2={13,4,5,220,2};
        int [] array3={12,42,52,210,23};
        System.out.println("En buyuk sayi: "+ getEnBuyukSayi(array));
        System.out.println("En buyuk sayi: "+ getEnBuyukSayi(array2));
        System.out.println("En buyuk sayi: "+ getEnBuyukSayi(array3));
    }
    public static int getEnBuyukSayi(int [] array){
        int enbuyukSayi=Integer.MIN_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(array [i]>enbuyukSayi){
                enbuyukSayi=array[i];

            }

        }
        return enbuyukSayi;
    }


}
