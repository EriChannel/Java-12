public class Cau6 {
    static final String REGEX_EMAIL = "^(.+)@(\\S+)$";
    public static void main(String[] args) {
        String email = "ngoc";
        if(validateEmail(email)){
            System.out.println("email hợp lệ");
        }else {
            System.out.println("email không hợp lệ");
        }
    }

    public static boolean validateEmail(String email){
        boolean flag = email.matches(REGEX_EMAIL);
        return flag;
    }
}
