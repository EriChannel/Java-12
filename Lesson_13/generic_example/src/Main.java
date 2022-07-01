import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add(4);
//        arrayList.add(5.5);
//        arrayList.add("Java");
//        arrayList.add(true);
//
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        //list.add("abc");

        MyGeneric<String> stringMyGeneric = new MyGeneric<>("Java");
        System.out.println(stringMyGeneric.getObj());

        MyGeneric<Integer> integerMyGeneric = new MyGeneric<>(5);
        System.out.println(integerMyGeneric.getObj());

        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"a", "b", "c", "d", "e"};

        printIntegerArray(intArray);
        printStringArray(strArray);
        System.out.println("---------------------------");

        MyGeneric.printArray(intArray);
        MyGeneric.printArray(strArray);
    }

    public static void printIntegerArray(Integer[] arr){
        for (Integer i: arr){
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printStringArray(String[] arr){
        for(String s : arr){
            System.out.print(s);
        }
        System.out.println();
    }
}