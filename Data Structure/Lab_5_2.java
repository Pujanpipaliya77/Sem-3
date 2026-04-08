import java.util.*;

public class Lab_5_2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][2];
        System.out.print("enter a matrix1 no:  ");

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                matrix1[i][j] = sc.nextInt();
            }
        } 

        int matrix2[][] = new int[2][3];
        System.out.print("enter a matrix2 no:  ");

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("multification of matrices:-");
        int multification[][] = new int[3][3];

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                multification[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    multification[i][j] += matrix1[i][j] * matrix2[i][j];
                    System.out.print(multification[i][j]+ ""); 
                }
                System.out.println();
            } 
        } 
        
   }
}