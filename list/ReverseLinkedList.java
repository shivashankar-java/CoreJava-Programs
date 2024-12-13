package list;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.descendingIterator();
        System.out.println("Reverse order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

