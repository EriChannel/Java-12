package org.example;

import org.example.model.Product;
import org.example.service.ProductService;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductService service = new ProductService();
        ArrayList<Product> list = service.getAllProduct();

        service.show(list);
    }
}
