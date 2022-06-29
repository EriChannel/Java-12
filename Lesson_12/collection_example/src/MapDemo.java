import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "Ngọc");
        hashMap.put(1, "Tuấn");
        hashMap.put(2, "Quang");
        hashMap.put(3, "Huy");
        hashMap.put(7, "Linh");
        hashMap.put(9, "Lâm");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        hashMap.put(2, "Cường");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(hashMap.remove(1));

        System.out.println(hashMap.get(5));

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put(6, "A");
        treeMap.put(1, "B");
        treeMap.put(2, "C");
        treeMap.put(9, "D");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
