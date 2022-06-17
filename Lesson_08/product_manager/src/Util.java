public class Util {

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Tìm sản phẩm theo id");
        System.out.println("4 - Tìm các sản phẩm có số lượng dưới 5");
        System.out.println("5 - Xem sản phẩm theo mức giá");
        System.out.println("0 - Thoát chương trình");
    }

    public static void subMenu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xóa sản phẩm");
        System.out.println("2 - Cập nhật số lượng sản phẩm");
        System.out.println("0 - Quay về trang chủ");
    }

    public static void priceMenu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Dưới 50.000");
        System.out.println("2 - Từ 50.000 đến 100.000");
        System.out.println("3 - Trên 100.000");
        System.out.println("0 - Quay về trang chủ");
    }
}
