package Youtube;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C21_DetayIterrator {

    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();
        name.add("Nilgun");
        name.add("Nalan");
        name.add("Ayten");

    ListIterator iter = name.listIterator();

        System.out.println(iter.next());//Nilgun
        System.out.println(iter.next());//Nalan
        System.out.println(iter.next());//Ayten
        System.out.println(iter.previous());//Ayten
        System.out.println(iter.previous());//Nalan
        System.out.println(iter.previous());//Nilgun

        iter.set("Nilgun 1234");
        iter.add("Ayse");

        System.out.println(name);//[Ayse, Nilgun 1234, Nalan, Ayten]
        System.out.println(iter.hasPrevious());
        iter.previous();


        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
