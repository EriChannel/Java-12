import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    public ArrayList<User> getAllUsers (){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("ngoc", "ngoc@gmail.com", "123456"));
        return list;
    }

    public User login(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        for(User u: list){
            System.out.println("Nhập username: ");
            String username = sc.nextLine();
            if(username.equals(u.getUserName())){
                System.out.println("Nhập username: ");
                String password = sc.nextLine();
                if (password.equals(u.getPassword())){
                    return u;
                }
            }
        }
        return null;
    }
}
