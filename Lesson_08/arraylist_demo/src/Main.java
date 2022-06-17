import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();
        //Thêm phần tử
        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(2);
        listInteger.add(9);
        listInteger.add(7);

        System.out.println(listInteger);

        for(Integer i : listInteger){
            System.out.print(i + "\t");
        }
        System.out.println();

        //Chèn phần tử vào index chỉ định
        listInteger.add(2, 6);
        System.out.println("Danh sách sau khi chèn");
        System.out.println(listInteger);

        //Cập nhật phần tử ở index chỉ định
        listInteger.set(0, 8);
        System.out.println("Danh sách sau khi cập nhật");
        System.out.println(listInteger);

        //Xóa phần tử
        listInteger.remove(0);
        System.out.println("Danh sách sau khi xóa");
        System.out.println(listInteger);

        //Tìm index của phần tử
        System.out.println(listInteger.indexOf(9));

        //Lấy kích thước
        System.out.println("Kích thước: " + listInteger.size());


        //Lấy ra phần tử
        System.out.println("Phần tử ở vị trí cuối cùng: " + listInteger.get(listInteger.size()-1));

        //Sắp xếp
        Collections.sort(listInteger);
        System.out.println(listInteger);

        Collections.reverse(listInteger);
        System.out.println(listInteger);

        Collections.shuffle(listInteger);
        System.out.println(listInteger);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(4);
        //list2.addAll(listInteger);
        list2.addAll(1, listInteger);

        System.out.println(list2);

    }
}
