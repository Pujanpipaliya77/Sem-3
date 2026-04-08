import java.util.*;

public class Lab_3_4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int smallest = 0;
        int biggest = 0;
        
        
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i=n;i<=n;i++){

            n=sc.nextInt();

            if(n>biggest){
                biggest=n;
            }
            System.out.print("biggest number is  : "+biggest);

            if(n<smallest){
                smallest = n;
            }
            System.out.print("smallest number is  : "+smallest);
        }
    }
}