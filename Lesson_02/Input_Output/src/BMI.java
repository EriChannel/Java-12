import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều cao: ");
        float height = sc.nextFloat();

        System.out.println("Nhập cân nặng: ");
        float weight = sc.nextFloat();

        float bmi = weight/(height*height);
        System.out.println("Chỉ số bmi của bạn là: " +bmi);

        System.out.printf("Chỉ số bmi của bạn là %.2f", bmi);
    }
}
