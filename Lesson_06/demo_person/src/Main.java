public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng mới
        Person hoa = new Person();
        hoa.name = "Hoa";
        hoa.age = 20;
        hoa.address = "Hà Nội";

        System.out.println(hoa.name + " - " + hoa.age + " - " + hoa.address);
        hoa.study();

        Person tuan = new Person();
        tuan.name = "Tuấn";
        tuan.age = 18;
        tuan.address = "Quảng Ninh";
        System.out.println(tuan.name + " - " + tuan.age + " - " + tuan.address);

        //Class dog
        Dog d1 = new Dog();
        d1.breed = " Chow Chow";
        d1.size = "Midium";
        d1.age = 3;
        d1.color = "Brown";
    }
}
