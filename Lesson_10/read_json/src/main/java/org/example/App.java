package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String json = "{\n" +
                "    \"name\": \"Wit Holdworth\",\n" +
                "    \"age\": 22,\n" +
                "    \"address\": \"Indonesia\"\n" +
                "  }";

        //Tạo đối tượng gson
        Gson gson = new Gson();

//        //Chuyển đổi từ Json sang đối tượng Person
//        Person p = gson.fromJson(json, Person.class);
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//
//        //Chuyển đối tượng Person sang Json
//        Person p1 = new Person("Ngọc", 26, "Hà Giang");
//
//        String rs = gson.toJson(p1);
//        System.out.println(rs);

        //Chuyển đổi từ Json sang mảng
        //Person[] person = null;

//        try {
//            //Đọc file
//            FileReader reader = new FileReader("person.json");
//
//            //Chuyển dữ liệu từ file sang mảng
//            person = gson.fromJson(reader, Person[].class);
//        } catch (FileNotFoundException e) {
//            System.out.println("Không tìm thấy file");
//        }
//
//        for(Person p : person){
//            System.out.println(p.getName() + " - " + p.getAge() +
//                    " - " + p.getAddress());
//        }
//
//        String rs = gson.toJson(person);
//
//        System.out.println(rs);

        //Chuyển Json sang ArrayList
        ArrayList<Person> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("person.json");
            Type type = new TypeToken<ArrayList<Person>>(){}.getType();
            System.out.println(type);

            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn file");
        }

        for(Person p : list){
            System.out.println(p.getName() + " - " + p.getAge() +
                    " - " + p.getAddress());
        }

    }
}
