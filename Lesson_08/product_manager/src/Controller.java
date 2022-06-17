import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ProductService service;
    ArrayList<Product> listProduct;
    Scanner sc;

    public Controller() {
        service = new ProductService();
        listProduct = service.getAllProduct();
        sc = new Scanner(System.in);
    }

    public void main(){


        while (true){
            Util.menu();
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose){
                case 1:
                    //Danh sách sp
                    System.out.println("Danh sách sản phẩm");
                    service.show(listProduct);
                    break;
                case 2:
                    getProductByName();
                    break;
                case 3:
                    getProductById();
                    break;
                case 4:
                    service.getProductByAmount(listProduct, 5);
                    break;

                case 5:
                    getProductByPrice();
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void getProductByName(){
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String fName = sc.nextLine();
        service.getProductByName(listProduct,fName);
    }

    public void getProductById(){
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        Product fProduct = service.getProductById(listProduct, id);
        System.out.println(fProduct);
        while (true){
            Util.subMenu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    service.deleteProduct(listProduct, fProduct);
                    break;
                case 2:
                    updateProductAmount(fProduct);
                    break;
                case 0:
                    main();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void updateProductAmount(Product product){
        System.out.println("Nhập số lượng mới: ");
        int newAmount = Integer.parseInt(sc.nextLine());
        service.updateAmountProduct(product, newAmount);
        System.out.println("Sản phẩm sau khi cập nhật");
        System.out.println(product);
    }

    public void getProductByPrice(){
        while (true){
            Util.priceMenu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    service.getProductByPrice(listProduct, 0, 50000);
                    break;
                case 2:
                    service.getProductByPrice(listProduct,50000, 100000);
                    break;
                case 3:
                    service.getProductByPrice(listProduct, 100000, Integer.MAX_VALUE);
                    break;
                case 0:
                    main();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
