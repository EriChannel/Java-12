package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Controller {

    BookService service;
    ArrayList<Book> books;
    Scanner sc;

    public Controller() {
        service = new BookService();
        books = service.getAllBook();
        sc = new Scanner(System.in);
    }

    public void main() {
        while (true) {
            Util.mainMenu();
            System.out.println("Lựa chọn của bạn là: ");
            int choice = inputNumber();

            switch (choice) {
                case 1:
                    System.out.println("Danh sách: ");
                    service.show(books);
                    break;
                case 2:
                    getBookByName();
                    break;
                case 3:
                    getBookByCategory();
                    break;
                case 4:
                    break;
                case 5:
                    service.sortByReleaseDate(books);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public int inputNumber() {
        boolean flag = true;
        while (flag) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                flag = false;
                return choice;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại.");
            }

        }
        return 0;
    }

    public void getBookByName() {
        System.out.println("Nhập tên sách cần tìm: ");
        String title = sc.nextLine();
        ArrayList<Book> list = new ArrayList<>();
        list = service.getBookByName(books, title);
        System.out.println("Số sách tìm được là: " + list.size());
        service.show(list);
    }

    public void getBookByCategory() {
        System.out.println("Nhập thể loại cần tìm: ");
        String category = sc.nextLine();
        ArrayList<Book> list = service.getBookByCategory(books, category);

        if (list.size() == 0) {
            System.out.println("Không tìm được quyển sách có thể loại " + category);
        } else {
            System.out.println("Số sách tìm được là: " + list.size());
            service.show(list);
        }

    }

}
