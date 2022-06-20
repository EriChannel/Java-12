public abstract class Person {

    public final int MAX = 1000;

    public void myMethod(){
        System.out.println("Phương thức của lớp cha");
        //MAX = 2000;
    }

    public abstract void myAbstractMethod();
}
