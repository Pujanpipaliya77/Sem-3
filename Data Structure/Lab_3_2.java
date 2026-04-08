import java.util.*;

public class Lab_3_2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for(int i=m;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("sum of the numbers is "+ sum);

    }
}