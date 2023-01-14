package Youtube;

import java.util.LinkedList;

public class C14_LinkedList {
    public static void main(String[] args) {


        LinkedList liste= new LinkedList<>();

        liste.add("Hasan");
        liste.add(200);
        liste.add(false);
        liste.add(new Araba());

        System.out.println(liste);

    }
}
