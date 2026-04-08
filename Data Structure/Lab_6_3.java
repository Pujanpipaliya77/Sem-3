import java.util.*;

class Student_detail{

    int Student_enrollmentnumber;
    String Student_name;
    int Student_sem;
    double Student_CPI;

    public void read(){

        Scanner sc = new Scanner(System.in);

        System.out.print("enetr a enrollmentnumber: ");
        Student_enrollmentnumber = sc.nextInt();

        System.out.print("enetr a name: ");
        Student_name = sc.next();

        System.out.print("enetr a semester: ");
        Student_sem = sc.nextInt();

        System.out.print("enetr a CPI: ");
        Student_CPI = sc.nextDouble();
    
    }

    public void print(){

        System.out.println("enrollmentnumber is: " + Student_enrollmentnumber);
        System.out.println("name is: " + Student_name);
        System.out.println("semester is: " + Student_sem);
        System.out.println("CPI is: " + Student_CPI);

    } 
}

public class Lab_6_3{
    public static void main(String[] args){
        Student_detail S = new Student_detail();

        for(int i=0;i<6;i++){
            S.read();
            S.print();
        }
    }
}