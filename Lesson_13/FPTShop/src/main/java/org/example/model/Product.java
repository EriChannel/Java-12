package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Util;

import java.util.Arrays;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private String description;
    private long price;
    private int amount;
    private int amountSale;
    private String brand;
    private Category[] categories;

    public Product(String name, String description, long price, int amount, int amountSale, String brand, Category[] categories) {
        this.id = Util.generateId(5);
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.amountSale = amountSale;
        this.brand = brand;
        this.categories = categories;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + Arrays.toString(categories);
    }
}
