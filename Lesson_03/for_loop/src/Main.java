public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("----------------------------");

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else{ //i chia hết cho 3 nhưng không chia hết cho 5
                    System.out.println("Fizz");
                }
            }else{
                if(i % 5 == 0){ // i chia hết cho 5 nhưng không chia hết cho 3
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
            }
        }
    }
}
