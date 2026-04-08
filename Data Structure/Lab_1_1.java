import java.util.*;

public class Lab_1_1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int raduis = sc.nextInt();
        double pi = 3.142,area;
        
        area = pi*raduis*raduis;

        System.out.print("area of circle is" +area);
    }
}