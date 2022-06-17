import java.util.ArrayList;

public class PersonService {
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("John", 30, "Mỹ"));
        listPerson.add(new Person("Anna", 25, "Nga"));
        listPerson.add(new Person("Joe", 17, "Canada"));
        listPerson.add(new Person("Chris", 20, "Mỹ"));

        return listPerson;
    }

    public void show(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p);
        }
    }

    public void getPersonByAge(ArrayList<Person> list){
        for(Person p : list){
            if(p.getAge() >= 18){
                System.out.println(p);
            }
        }
    }
}
