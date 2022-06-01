public class Main {

    static final int MAX = 100;
    public static void main(String[] args) {
        //MAX  = 200;
        //Sử dụng String literal
        String name = "Ngọc";
        System.out.println("Tôi tên là: " + name);

        //Sử dụng từ khóa new
        String address = new String("Hà Nội");
        System.out.println("Tôi đến từ: " + address);

        System.out.println("Độ dài chuỗi address là: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toLowerCase());

        System.out.println(name.equals(address));

        String name1 = "ngọc";
        System.out.println("name.equals(name1) = "+name.equals(name1));
        System.out.println("name.equalsIgnoreCase(name1) = "+name.equalsIgnoreCase(name1));

        String name2 = new String("Ngọc");
        System.out.println("name == name2 = "+ name == name2);
        System.out.println("name.equals(name2) = "+ name.equals(name2));

        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("c"));

        String myAddress = "american";
        System.out.println(myAddress.lastIndexOf("a"));
        System.out.println(myAddress.indexOf("a", 2));

        String gender = "   male   ";
        System.out.println(gender);
        System.out.println(gender.trim());

        System.out.println(myAddress.substring(3));
        System.out.println(myAddress.substring(3, 5));


        String myName = "tuấn";
        //Cách 1
        String upperCase = myName.toUpperCase();
        String result = upperCase.charAt(0) + myName.substring(1);
        System.out.println(result);

        //Cách 2
        String upperCaseT = String.valueOf(myName.charAt(0)).toUpperCase();
        String rs = upperCaseT + myName.substring(1);
        System.out.println(rs);

        System.out.println("Xin chào, tôi tên là \"Ngọc\". Tôi đến từ Hà Giang");
        System.out.println("2\\3");


        Gender nam = Gender.MALE;
        System.out.println(nam);

        Gender nu = Gender.FEMALE;
        System.out.println(nu);
    }
}
