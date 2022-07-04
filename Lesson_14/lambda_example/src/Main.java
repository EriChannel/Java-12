import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(5);



//        for(Integer i : list){
//            System.out.print(i + "\t");
//        }
//
//        System.out.println();
//
//        list.forEach(n -> System.out.print(n + "\t"));
//        list.forEach(System.out::print);
//
//        System.out.println();
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//
//        list.forEach(n -> System.out.print(n + "\t"));
//
//        System.out.println();
//
//        //Sử dụng lambda
//        list.sort((o1, o2) -> o1-o2);
//
//        list.forEach(n -> System.out.print(n + "\t"));
//
//        System.out.println();
//        //Lớp vo danh
//        IAddNumber addNumber = new IAddNumber() {
//            @Override
//            public int addTowNumber(int a, int b, int c) {
//                return a + b;
//            }
//
////            @Override
////            public void method() {
////
////            }
//        };
//        System.out.println(addNumber.addTowNumber(4, 5, 6));
//
//        //Sử dụng lambda
//        IAddNumber addNumber1 = (a, b, c) -> {return a+b+c;};
//        System.out.println(addNumber1.addTowNumber(10, 20, 30));
//
//        IPrint print = () -> {
//            System.out.println("Xin chào");
//            System.out.println("Tối tên là Ngọc");
//        };
//
//        print.method();
//
//        Collections.sort(list, Integer::compareTo);
//        System.out.println(list);
//
//        ArrayList<Person> arrayList = new ArrayList<>();
//        Collections.sort(arrayList, (p1, p2) -> Person.compareByAge(p1, p2));
//
//        Collections.sort(arrayList, Person::compareByAge);
//
//
        //Lấy ra các phần tử là số chẵn
        list.stream().filter(i -> i%2==0).
                forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        list.stream().sorted().forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        list.stream().sorted((i1, i2) -> i2-i1).
                forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        list.stream().map(i -> i*10)
                .forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        list.stream().distinct()
                .sorted((i1,i2) -> i2-i1)
                .forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        long count = list.stream().filter(i->i%2==0).count();
        System.out.println(count);

        Integer max = list.stream().max(Integer::compare).get();
        Integer min = list.stream().min(Integer::compare).get();

        System.out.println(max + " - " + min);

        list.stream().limit(4).forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        list.stream().skip(2).limit(4)
                .forEach(i -> System.out.print(i + "\t"));

    }
}