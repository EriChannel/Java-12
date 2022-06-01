import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Lấy ra ngày hiện tại
        LocalDate toDay = LocalDate.now();
        System.out.println("Hôm nay là: " +toDay);

        LocalDate date = LocalDate.of(2020, Month.AUGUST, 10);
        System.out.println(date);

        System.out.println("Hôm này là ngày: " + toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());
        System.out.println(toDay.getMonth());
        System.out.println(toDay.getYear());

        System.out.println("Ngày mai: " + toDay.plusDays(1));
        System.out.println("Hôm qua: " + toDay.minusDays(1));


        LocalTime now = LocalTime.now();
        System.out.println("Bây giờ là: " +now);
        LocalTime hour = LocalTime.of(22, 30);
        System.out.println(hour);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(date, hour);
        System.out.println(localDateTime);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm");
        System.out.println(dateTime.format(myFormat));
    }
}
