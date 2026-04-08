import java.util.*;

public class Lab_6_1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a first number: ");
        int a = sc.nextInt();

        System.out.print("enter a second number: ");
        int b = sc.nextInt();

        swapnumber(a,b);

    }
     public static void swapnumber(int a,int b){

            int temp = a;
            a = b;
            b = temp;

            System.out.println(a);
            System.out.print(b);
        }
}