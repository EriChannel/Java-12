public class Main {
    public static void main(String[] args) {
        //Upcasting
        Person p = new Teacher();

        p.myMethod();

        //Downcasting
        Teacher t = (Teacher) p;

        //Lỗi khi tạo đối tượng từ lớp trừu tượng
        //Person person = new Person();

    }
}