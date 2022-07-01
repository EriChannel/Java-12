package org.example.service;

import org.example.model.Category;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductService {

    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("abc", "abc", 2000000,
                20,10,"Samsung", new Category[]{Category.PHONE}));
        return list;
    }

    public void show(ArrayList<Product> list){
        for (Product p : list){
            System.out.println(p.getId() + " - " + p.getName() + " - " + printCategory(p.getCategories()));
        }
    }

    public String printCategory(Category[] categories){
        for (Category c : categories){
            return c.getValue();
        }

        return null;
    }
}
