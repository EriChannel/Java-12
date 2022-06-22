import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//
//        int c = a/b;
//
//        System.out.println(c);

        //int[] arr = new int[-3];

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            try {
                System.out.println("Nhập số phần tử của mảng: ");
                int x = Integer.parseInt(sc.nextLine());
                //System.out.println(x);
                int[] arr = new int[x];
                flag = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại: ");
            }catch (NegativeArraySizeException e){
                System.out.println("Kích thước mảng phải là số dương");
                System.out.println("Vui lòng nhập lại: ");
            }finally {
                System.out.println("Khối này luôn được thực thi");
            }
        }



//        try {
//            System.out.println("Nhập số phần tử của mảng: ");
//            int x = sc.nextInt();
//            //System.out.println(x);
//            int[] arr = new int[x];
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("Khối này luôn được thực thi");
//        }
    }
}