package Youtube;

import java.util.LinkedList;
import java.util.List;

public class C15_LinkedListDataEkleme {
    public static void main(String[] args) {


        List<String> list2=new LinkedList<>();
        list2.add("Hasan");
        list2.add("Nilgun");
        list2.add("Nalan");
        //sirali sekilde

        for (int i=list2.size()-1; i >=0 ;i--) {

            System.out.println(list2.get(i)+" ");


        }
        for (int i = 0; i < list2.size() ; i++) {

            System.out.println(list2.get(i) + " ");


        }
    }
}
