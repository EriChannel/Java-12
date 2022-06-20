import java.util.Comparator;

public class Teacher extends Person implements ITeacher {

    @Override
    public void myMethod() {
        super.myMethod();
        System.out.println("Phương thức được lớp con ghi đè");
    }

    @Override
    public void myAbstractMethod() {
        System.out.println("Phương thức trừu tượng");
    }

    public void subMethod(){
        System.out.println("Phương thức của lớp con");
    }

    @Override
    public void abstractMethod() {

    }

    @Override
    public int method(int a, int b) {
        return 0;
    }
}
