import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PersonService service = new PersonService();
        ArrayList<Person> list = service.getAllPerson();
        service.show(list);

        System.out.println("Danh sách những người có tuổi từ 18 trở lên: ");
        service.getPersonByAge(list);
//        ArrayList<Person> listPerson = new ArrayList<>();
//        listPerson.add(new Person("John", 30, "Mỹ"));
//        listPerson.add(new Person("Anna", 25, "Nga"));
//        listPerson.add(new Person("Joe", 17, "Canada"));
//        listPerson.add(new Person("Chris", 20, "Mỹ"));
//
//        for(Person p : listPerson){
//            System.out.println(p);
//        }
//
//        System.out.println("Danh sách những người có tuổi từ 18 trở lên: ");
//        for(Person p: listPerson){
//            if(p.getAge() >= 18){
//                System.out.println(p);
//            }
//        }
//
//        for(int i = 0 ; i < listPerson.size(); i++){
//            if(listPerson.get(i).getName().equals("Anna")){
//                listPerson.get(i).setAge(27);
//            }
//        }
//        for(Person p : listPerson){
//            System.out.println(p);
//        }

        //Lấy ra những người có địa chỉ là ở Mỹ
        //Cập nhật địa chỉ của người có tên là Chris thành Nhật Bản
    }
}
