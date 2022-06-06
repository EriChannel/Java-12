import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 13;
        if(x % 2 == 0){
            System.out.println(x + " là số chẵn");
        } else {
            System.out.println(x + " là số lẻ");
        }

        System.out.println("Done!!!");

//        int a = 5;
//        int b = 7;
//        int c = 1;
//
//        if(a < b){
//            if(a < c){
//                System.out.println(a + " là số nhỏ nhất");
//            }else { //a > c
//                System.out.println(c + " là số nhỏ nhất");
//            }
//        }


        double bmi = 23;
        if(bmi < 18){
            System.out.println("Bạn gầy");
        }else if(bmi >= 18 && bmi <= 22){
            System.out.println("Bình thường");
        }else{
            System.out.println("Thừa cân");
        }


        // cho ba cạnh a, b, c nhập vào từ bàn phím
        // kiểm tra 3 cạnh có hợp thành tam giác không
        // tổng 2 cạnh lớn hơn cạnh còn lại

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = sc.nextInt();

        if(a + b > c && a + c > b && c + b > a ){
            System.out.println("Ba cạnh hợp thành tam giác");
        }else {
            System.out.println("Ba cạnh không hợp thành tam giác");
        }

    }
}
