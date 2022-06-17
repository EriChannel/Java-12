import java.util.ArrayList;

public class Excercise {
    public static void main(String[] args) {
        //Tạo ArrayList để chứa các phần tử kiểu String
        //Thêm phần tử vào ArrayList
        //Lấy ra số lượng phần tử
        //Đếm các phần tử Java trong ArrayList

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("HTML/CSS");
        list.add("PHP");
        list.add("Java");
        list.add("Python");

        System.out.println("Số lượng phần tử có trong list: " + list.size());

        String str = "Java";
        int count =0;
        for(String s : list){
            if(s.equals(str)){
                count++;
            }
        }

        System.out.printf("Số lần phần tử %s xuất hiện là %d", str, count);


    }
}
