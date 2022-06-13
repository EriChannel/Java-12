public class Cau4 {
    public static void main(String[] args) {
        //Liệt kê 10 số nguyên tố đầu tiên
        int max = 10;
        int count = 0;
        for(int i = 0; count < max; i++){
            if(isPrimeNumber(i)){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println();

        //Liệt kê các số nguyên tố nhỏ hơn 10
        for(int i = 0; i < max; i++){
            if(isPrimeNumber(i)){
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
