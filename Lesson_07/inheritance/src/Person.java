import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate dob;
    private Address address;

    public Person(int id, String name, LocalDate dob, Address address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public Person() {
    }

    public void myMethod(){
        System.out.println("Lớp cha");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + dob + " - " + address;
    }
}
