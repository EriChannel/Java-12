public class MyGeneric <T>{
    public T obj;

    public T[] arr;

    public MyGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static <T> void printArray(T[] arr){
        for(T t : arr){
            System.out.print(t);
        }
        System.out.println();
    }
}
