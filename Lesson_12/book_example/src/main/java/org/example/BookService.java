package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class BookService {

    public ArrayList<Book> getAllBook(){
        ArrayList<Book> list = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("book.json");

            Type type = new TypeToken<ArrayList<Book>>(){}.getType();

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
