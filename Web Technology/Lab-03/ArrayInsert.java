
import java.lang.reflect.Array;
import java.util.Scanner;


public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            int[i] = sc.nextInt();
        } 

        System.out.println("enter the number to insert");
        int Numbertoinsert = sc.nextInt();

        System.out.println("enter the position to insert");
        int Indextoinsert = sc.nextInt();

        for (int i = a-1; i > Indextoinsert; i--) {
            Array[i+1] = Array[i];
            
        }
        System.out.println([i]);
}