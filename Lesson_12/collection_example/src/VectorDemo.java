import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(3);
        vector.add(2);
        vector.add(0);
        vector.add(9);

        for(Integer i : vector){
            System.out.println(i);
        }

    }
}
