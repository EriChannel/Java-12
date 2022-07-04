package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        BookService service = new BookService();
//
//        ArrayList<Book> list = service.getAllBook();
//
//        list.forEach(i -> System.out.println(i));

        Controller controller = new Controller();

        controller.main();
    }
}
