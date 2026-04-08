import java.util.*;

class Employee_Detail{

    int Employee_id;
    String  Employee_name;
    String  Employee_designation;
    double  Employee_salary;

    public void read(){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a id: ");
        Employee_id = sc.nextInt();
        
        System.out.print("enter a name: ");
        Employee_name = sc.next();
        
        System.out.print("enter a designation: ");
        Employee_designation = sc.next();

        System.out.print("enter a salary: ");
        Employee_salary = sc.nextDouble();
    }

    public void print(){

        System.out.println("ID is : " + Employee_id);
        System.out.println("NAME is : " + Employee_name);
        System.out.println("DESIGNATION is : " + Employee_designation);
        System.out.print("SALRY is : " + Employee_salary);

    }
}

public class Lab_6_2{
        public static void main(String[] args){

            Employee_Detail ED = new Employee_Detail();
            ED.read();
            ED.print();
        }
}