import java.util.StringTokenizer;

public class Cau2 {
    public static void main(String[] args) {
        String s= "You only live once, but if you do it right, once is enough";

        //đếm số từ
        String[] arr = s.split(" ");
        System.out.println("Số từ trong chuỗi: " + arr.length);

//        StringTokenizer temp = new StringTokenizer(s);
//        System.out.println(temp.countTokens());

        //Đếm ký tự o xuất hiện
        char c = 'o';
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                System.out.println("Ký tự " + c + " xuất hiện ở: " + i);
                count++;
            }
        }
        System.out.println("Số lần ký tự xuất hiện: " +count);
    }
}
