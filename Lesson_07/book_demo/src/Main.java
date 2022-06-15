import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        Book[] arrBook = service.getAllBooks();
        System.out.println("Danh sách: ");
        service.show(arrBook);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên quyển sách cần tìm: ");
        String fName = sc.nextLine();
        System.out.println("Sách tìm được là: ");
        service.findBookByName(arrBook, fName);

        System.out.println("Danh sách sách xuất bản trong năm nay: ");
        int year = LocalDate.now().getYear();
        service.findBookByYear(arrBook, year);
    }
}
