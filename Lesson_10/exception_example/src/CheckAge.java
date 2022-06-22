import java.io.IOException;
import java.util.Scanner;

public class CheckAge {

    public static void main(String[] args) {

        int age = getAge();
        System.out.println(age);

    }


    public static int getAge(){
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int age = 0;
        while (flag){
            try {
                System.out.println("NHập tuổi của bạn");
                age = Integer.parseInt(sc.nextLine());

                if(age < 0) throw new CustomException("Tuổi phải là số dương");

                flag = false;
            }catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu, vui lòng nhập lại");
            }catch (CustomException e){
                System.out.println(e.getMessage());
            }
        }

        return age;

    }
}
