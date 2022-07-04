public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static int compareByAge(Person p1, Person p2){
        return p1.age - p2.age;
    }
}
