public class Cau1 {
    public static void main(String[] args) {
        int c = 4;
        drawSquare(c);

        System.out.println("------------------------");
        int h = 4;
        drawTriagle(h);
        System.out.println("----------------------------");
        drawRightTriagle(h);

    }

    public static void drawSquare(int c){
        for(int i = 1; i <= c; i++){
            for(int j = 1; j <= c; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void drawTriagle(int h){
        for(int i = 1; i<= h; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void drawRightTriagle(int h){
        for(int i = 1; i <= h; i++){
            for(int j = i; j < h; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
