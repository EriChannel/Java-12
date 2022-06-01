import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi của bạn: ");
        //int age = sc.nextInt();
        //sc.nextLine(); //Xử lý trôi lệnh
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập địa chỉ của bạn: ");
        String address = sc.nextLine();

        System.out.println("Tên tôi là " + name + ", năm nay tôi " + age + " tuổi"
            + ", tôi đến từ " + address);

        System.out.printf("Tên tôi là %s, năm nay tôi %d tuổi, tôi đến từ %s", name, age, address);

        System.out.println("");
        System.out.print("Lục ");
        System.out.print("Thanh ");
        System.out.print("Ngọc");
    }
}
