import java.util.Scanner;

public class Cau5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Nhập số hàng: ");
        int row = sc.nextInt();

        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();

        int[][] arrA = createArray(row, col);
        show(arrA);

        System.out.println("Đường chéo chính: ");
        duongCheoChinh(arrA, row, col);

        int[][] arrB = createArray(row, col);
        show(arrB);

    }

    public static int[][] createArray(int row, int col){
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("Nhập phần tử thứ [%d][%d]: ", i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void show(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }

    public static void duongCheoChinh(int[][]arr, int row, int col){
        if(row == col){
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    if(i == j){
                        System.out.print(arr[i][j] + "\t");
                    }
                }
            }
        }else {
            System.out.println("Không có đường chéo chính");
        }
        System.out.println();
    }

}
