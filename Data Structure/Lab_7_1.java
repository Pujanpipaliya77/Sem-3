import java.util.*;

class stackdemo{
    int maxsize;
    int[] n;   
    int top;
    

    stackdemo(int size){
        maxsize = size;
        n = new int[maxsize];
        top=-1;
    }

    public void push(int x){

        Scanner sc = new Scanner(System.in);

        if(top == maxsize-1){
            System.out.print("stack is overflow.");
        }
        else{
            top++;
            n[top] = x;
        }
    }

    public int pop(){

        Scanner sc = new Scanner(System.in);

        if(top == -1){
            System.out.print("stack is underflow.");
            return -1;
        }
        else{
            top--;
            return (n[top+1]);
        }
    }

}

public class Lab_7_1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        stackdemo S = new stackdemo(5);

        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        S.push(60);

        S.pop();
        S.pop();
        S.pop();
        S.pop();
        S.pop();
        S.pop();
    }
}
