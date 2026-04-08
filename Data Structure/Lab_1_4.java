import java.util.*;

public class Lab_1_4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;

        for(int i=1;i<=n;i++){
            num=num*i;
        }
        System.out.print("number of factor is"+num);
    }
}