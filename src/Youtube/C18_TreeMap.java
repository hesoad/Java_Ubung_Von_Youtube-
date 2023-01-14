package Youtube;

import java.util.HashMap;
import java.util.TreeMap;

public class C18_TreeMap {
    public static void main(String[] args) {

     HashMap<String,Integer> liste=new HashMap<>();

     HashMap<String,Ogretmen>liste2=new HashMap<>(); // ogretmen klassindan veri de kullanmak mumkun , daha dogrusu nesne kullanilabilir

        liste.put("Zeynep",90);
        liste.put("Berk",70);
        liste.put("Ali",50);
        liste.put("Veli",40);


        System.out.println(liste);
    }
}
