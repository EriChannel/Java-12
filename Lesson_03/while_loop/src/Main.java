import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 0;
//
//        while (i < 5){
//            System.out.println(i);
//            //i++;
//        }

//        int age = 0;
        Scanner sc = new Scanner(System.in);
//        while (age < 18){
//            System.out.println("Nhập tuổi: ");
//            age = sc.nextInt();
//        }
//
//        System.out.println("Bạn đủ tuổi bầu cử");

        Random rd = new Random();
        int rdNumber = rd.nextInt(100);


//        int number = 0;
//
//        while (number != rdNumber){
//            System.out.println("Đoán số: ");
//            number = sc.nextInt();
//            if(number == rdNumber){
//                System.out.println("Bạn đoán trúng rồi");
//            }
//        }

//        boolean flag = true;
//        while (flag){
//            System.out.println("Đoán số: ");
//            int number = sc.nextInt();
//
//            if(number < rdNumber){
//                System.out.println("Bạn đoán nhỏ hơn rồi");
//                System.out.println("Vui lòng đoán lại");
//            }else if(number > rdNumber){
//                System.out.println("Bạn đoán lớn hơn rồi");
//                System.out.println("Vui lòng đoán lại");
//            }else {
//                System.out.println("Bạn trúng sổ số rồi");
//                flag = false;
//            }
//        }


//        do {
//            System.out.println("Xin chào");
//        }while (false);
        int age = -1;
        do {
            System.out.println("Nhập tuổi");
            age = sc.nextInt();
        }while (age < 0);

        System.out.println("Tuổi của bạn là " + age);


    }
}
