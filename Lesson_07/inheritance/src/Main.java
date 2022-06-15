import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.myMethod();

        s.setId(1);
        s.setName("Hoa");
        s.setDob(LocalDate.of(1990,12,12));
        s.setAddress(new Address("Việt Nam", "Hà Nội", "Nam Từ Liêm"));
        s.setPoint(8.5);

        Address address = new Address("Việt Nam", "Hà Nội", "Nam Từ Liêm");

        System.out.println(address);

        System.out.println(s);



    }
}
