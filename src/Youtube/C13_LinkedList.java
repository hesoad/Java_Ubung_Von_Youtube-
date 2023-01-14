package Youtube;

import java.util.LinkedList;

public class C13_LinkedList {
    public static void main(String[] args) {


        LinkedList list=new LinkedList<>();

        list.add("Hamza");
        list.add("Burak");
        list.add("Ayse");


        list.addLast("Hasan");
        list.addFirst("Ayten");

        System.out.println(list);//[Ayten, Hamza, Burak, Ayse, Hasan]

        list.remove("Hamza");

        list.remove(3);
        System.out.println(list);//[Ayten, Burak, Ayse]

        System.out.println(list.get(0));//Ayten
        System.out.println(list.getLast());//Ayse

        System.out.println(list.contains("Burak"));//true
        System.out.println(list.size());

        list.clear();
        System.out.println(list);//[]



    }
}
