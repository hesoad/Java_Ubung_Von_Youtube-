package Youtube;

public class C11_MethodPratikSifre {
    public static void main(String[] args) {
        /*
        Icerisinde parametre olarak gonerilen "Sifrenin" icerisinde
        sayi ve harf olup olmadigini kontrol edin
         */
        String sifre="Asd12";
        String sifre2="Asd";
        String sifre3="12";

        System.out.println("Sonuc: "+checkPassWort(sifre));
        System.out.println("Sonuc: "+checkPassWort(sifre3));
        System.out.println("Sonuc: "+checkPassWort(sifre2));
    }
    public static boolean checkPassWort(String sifre){
        boolean harfVarMi=false;
        boolean rakamVarMi=false;
        for (int i = 0; i <sifre.length() ; i++) {
            if(sifre.charAt(i)>='0'&&sifre.charAt(i)<='9'){
                rakamVarMi=true;

            }else if (sifre.charAt(i)>='a'&& sifre.charAt(i)<='z'){
                harfVarMi=true;

            }else if (sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z'){
                harfVarMi=true;
            }

        }
        boolean sonuc= harfVarMi && rakamVarMi;


        return sonuc;
    }
}
