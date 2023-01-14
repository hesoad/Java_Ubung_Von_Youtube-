package Youtube;

import java.util.HashMap;

public class C17_MapdeEntrySet {
    public static void main(String[] args) {
        HashMap<String,Integer>liste=new HashMap<>();
        liste.put("Hasan",75);
        liste.put("Ali",75);
        liste.put("Kadir",75);
        System.out.println(liste);//{Hasan=75, Kadir=75, Ali=75}

        System.out.println(liste.containsKey("Kadir"));//true
        System.out.println(liste.containsValue(100));//false

        System.out.println("Entry Set :"+ liste.entrySet());//Entry Set :[Hasan=75, Kadir=75, Ali=75]

        System.out.println("Key seti:"+ liste.keySet());//Key seti:[Hasan, Kadir, Ali]

        liste.remove("Ali");
        System.out.println(liste);//Listenin son hali {Hasan=75, Kadir=75}

        System.out.println(liste.size());


    }

}
