import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        linkedList.forEach(i-> System.out.println(i));




    }
}
