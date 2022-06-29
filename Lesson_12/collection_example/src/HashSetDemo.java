import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(5));
        System.out.println(hashSet.add(5));
        hashSet.add(34);
        hashSet.add(1);
        hashSet.add(70);

        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(0);
        linkedHashSet.add(9);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(15);
        treeSet.add(7);
        treeSet.add(85);
        treeSet.add(14);

        System.out.println(treeSet);

        System.out.println("Sắp xếp giảm dần: " + treeSet.descendingSet()) ;


    }
}
