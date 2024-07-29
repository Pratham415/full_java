import java.util.Scanner;
class Matrix{
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int[][] data){
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix(int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix sub(Matrix mat2){
        if(this.rows != mat2.rows || this.cols != mat2.cols){
            System.out.println("The matrix dimension are not match ");
            return new Matrix(0, 0);
        }
        
        Matrix result = new Matrix(this.rows,this.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - mat2.data[i][j];
            }
        }
        return result;
    }

    public void display(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%02d " , data[i][j]);
            }
            System.out.println();
        }
       
    }
}

public class Matrix_sub {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        int[][] matrix_1 = {{1,2},{3,4}};
        int[][] matrix_2 = {{3,4},{5,6}};

        Matrix matrix1 = new Matrix(matrix_1);
        Matrix matrix2 = new Matrix(matrix_2);

        System.out.println("The matrix 1 :");
        matrix1.display();
        System.out.println("The matrix 2 : ");
        matrix2.display();


        // System.out.println("Enter the matrix 1 : ");
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         matrix_1[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }
        // System.out.println("enter the matrix 2 : ");
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         matrix_2[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }
       
        Matrix result;

        result = matrix1.sub(matrix2);
        System.out.println("\nMatrix 1 - matrix 2 : ");
        result.display();
    }
    
}

