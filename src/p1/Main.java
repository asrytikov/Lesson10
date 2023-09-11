package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("Italy");
        states.add("Russia");

        Iterator<String> iterator = states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = states.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        listIterator.set("Spain");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

}
