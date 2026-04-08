import java.util.*;

public class Lab_4_2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a-1];

        System.out.print("enter the number of delete: ");
        int numbertodelete = sc.nextInt();

        if(numbertodelete<0 || numbertodelete>=a){
            System.out.print("invalid index deletaion not possible.");
        }

        else{
            for(int i=numbertodelete;i<a;i++){
                array[i] = array[i+1];
            }
        }
        System.out.print(array[i+1]);
    }
}