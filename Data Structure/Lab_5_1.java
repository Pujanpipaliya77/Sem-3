import java.util.*;

public class Lab_5_1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[2][2];
        System.out.print("enter a matrix1 no:  ");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix1[i][j] = sc.nextInt();
            }
        } 

        int matrix2[][] = new int[2][2];
        System.out.print("enter a matrix2 no:  ");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrices:-");
        int sumofmatrix[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sumofmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumofmatrix[i][j]+ "");
            }
            System.out.println();
        
        }
        
   }
}