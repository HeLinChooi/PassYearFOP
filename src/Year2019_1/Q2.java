package Year2019_1;
import java.util.Random;
import java.util.Scanner;
public class Q2 {
    static Random r = new Random();
    //this method generate 1 matrix with dimension*dimension size
    public static int[][] generate(int dimension){
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
        return matrix;
    }
    //this method display matrix
    public static void display(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //this method add 2 matrix
    public static int[][] add(int[][] x,int[][] y){
        int[][] result = new int[x.length][x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                result[i][j] = x[i][j] + y[i][j];
            }
        }
        return result;
    }
    //this method multiply 2 matrix
    public static int[][] multiply(int[][] x,int[][] y){
        int[][] result = new int[x.length][x.length];
        int[] tempRow = new int[x.length];
        int[] tempCol = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                //make 2 array then multiple respective number and add them up
                for (int k = 0; k < x.length; k++) {
                    tempRow[k] = x[i][k];
                }
                for (int k = 0; k < x.length; k++) {
                    tempCol[k] = y[k][j];
                }
                for (int k = 0; k < x.length; k++) {
                    result[i][j] += tempRow[k]*tempCol[k];
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = s.nextInt();
        int[][] matrixA = generate(n);
        int[][] matrixB = generate(n);
        System.out.println("Matrix A");
        display(matrixA);
        System.out.println("Matrix B");
        display(matrixB);
        int[][] resultOfAdd = add(matrixA,matrixB);
        int[][] resultOfMul = multiply(matrixA, matrixB);
        System.out.println("Matrix A + B");
        display(resultOfAdd);
        System.out.println("Matrix A X B");
        display(resultOfMul);
        System.out.println("");
    }
}
