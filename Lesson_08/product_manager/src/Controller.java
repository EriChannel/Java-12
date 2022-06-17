import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ProductService service;
    ArrayList<Product> listProduct;

    public Controller() {
        service = new ProductService();
        listProduct = service.getAllProduct();
    }

    public void main(){
        Scanner sc = new Scanner(System.in);

        while (true){
            Util.menu();
            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    //Danh sách sp
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
