import java.util.*;

public class Lab_3_3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0;i<=n;i++){
                sum = sum+i;
        }
        double avg = (double)sum/n;
        System.out.print("avrerage is" +avg);
    }
}