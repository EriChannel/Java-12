package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookService service = new BookService();
        ArrayList<Book> list = service.getAllBook();

        for(Book b : list){
            System.out.println(b);
        }

//        ArrayList<String>categories = new ArrayList<>();
//        for(Book b : list){
//            for(int i = 0; i < b.getCategory().length; i++){
//                if(!categories.contains(b.getCategory()[i])){
//                    categories.add(b.getCategory()[i]);
//                }
//            }
//        }
//
//        for(String s : categories){
//            System.out.println(s +" - " +countBook(s, list));
//        }
//
//        System.out.println("---------------------");

        Map<String, Integer> map = new HashMap<>();
        for(Book b : list){
            for(String category : b.getCategory()){
                if(map.containsKey(category)){
                    map.put(category, map.get(category) + 1);
                }else {
                    map.put(category, 1);
                }
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }

    public static int countBook(String category, ArrayList<Book> list){
        int count = 0;
        for(Book b : list){
            for(int i = 0; i < b.getCategory().length; i++){
                if(b.getCategory()[i].equals(category)){
                    count++;
                }
            }
        }
        return count;
    }
}
