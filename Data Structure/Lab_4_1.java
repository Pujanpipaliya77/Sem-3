import java.util.*;

public class Lab_4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int a = sc.nextInt();
        int[] array = new int[a + 1];

        System.out.println("Enter the elements:");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to insert: ");
        int noofinsert = sc.nextInt();

        System.out.print("Enter the index at which to insert: ");
        int insertindex = sc.nextInt();

        System.out.println("Original array: " + Arrays.toString(array));

        // Shift elements to make space for insertion
        for (int i = a - 1; i >= insertindex; i--) {
            array[i + 1] = array[i];
        }

        // Insert the number at the specified index
        array[insertindex] = noofinsert;

        // Print the modified array after insertion
        System.out.println("Modified array: " + Arrays.toString(array));
    }
}


       