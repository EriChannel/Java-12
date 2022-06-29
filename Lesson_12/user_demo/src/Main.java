import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        ArrayList<User> list = service.getAllUsers();

        User userLogin = service.login(list);

        System.out.println("xin chào " + userLogin.getUserName());
    }
}