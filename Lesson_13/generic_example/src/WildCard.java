import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Comparator;

public class WildCard {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Hoa", 20, "HN", 8.5));
        listStudent.add(new Student("Quang", 20, "HN", 8.5));
        listStudent.add(new Student("Quân", 20, "HN", 8.5));


        ArrayList<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(new Teacher("Chung", 30, "HN", 3000000));
        listTeacher.add(new Teacher("Tuấn", 30, "HN", 3000000));
        listTeacher.add(new Teacher("Quỳnh", 30, "HN", 3000000));

        System.out.println("Danh sách học sinh");
        show(listStudent);

        System.out.println("Danh sách giảng viên: ");
        show(listTeacher);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        //show(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");

        showArrayList(integerArrayList);
        //showArrayList(stringArrayList);

        Comparator
    }


    public static void show(ArrayList<?> list){
        for (Object o: list){
            System.out.println(o);
        }
    }

    public static void showArrayList(ArrayList<? extends Number> list){
        for (Number n : list){
            System.out.println(n);
        }
    }
}
