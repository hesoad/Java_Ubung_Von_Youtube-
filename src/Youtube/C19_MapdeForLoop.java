package Youtube;

import java.util.HashMap;
import java.util.Map;

public class C19_MapdeForLoop {
    public static void main(String[] args) {

        HashMap<String,Integer>liste=new HashMap<>();
        liste.put("Ali",70);
        liste.put("Bekir",80);
        liste.put("Zeynep",90);

        System.out.println(liste);//{Bekir=80, Zeynep=90, Ali=70}
        for (Map.Entry<String, Integer> eachisim:liste.entrySet()) {

            System.out.println(eachisim);
            System.out.println(eachisim.getKey());
            System.out.println(eachisim.getValue());
            System.out.println();


        }

    }
}
