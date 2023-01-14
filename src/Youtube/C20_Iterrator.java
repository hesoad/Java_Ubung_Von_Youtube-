package Youtube;

import java.util.ArrayList;
import java.util.Iterator;

public class C20_Iterrator {
    public static void main(String[] args) {

        ArrayList<String>name= new ArrayList<>();
        name.add("Nilgun");
        name.add("Nalan");
        name.add("Ayten");

        Iterator iter= name.iterator();

        while (iter.hasNext()){
            System.out.print(iter.next()+" ");//Nilgun Nalan Ayten
        }


      /*
        System.out.println(iter.hasNext());//true// Bir data var mi ? treu

        System.out.println(iter.next());//Nilgun
        iter.remove();//Nilgun
        System.out.println(iter.next());//Nalan
        System.out.println(iter.next());//Ayten

        System.out.println(name);//[Nalan, Ayten]

       */

    }
}
