import java.util.*;

class stackdemo{
    int maxsize;
    char[] n;   
    int top;
    

    stackdemo(int size){
        maxsize = size;
        n = new char[maxsize];
        top=-1;
    }

    public void push(char x){

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

public class Lab_7_2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        stackdemo st = new stackdemo(10);
        String str = "abcba";

        int index=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!='c'){
                st.push(str.charAt(i));
                index++;
            }
            else{
                break;
            }
        }

        boolean flag = true;
        for(int j=index+1; j<str.length(); j++){
            if(st.pop() != str.charAt(j)){
                flag = false;
                break;
            }
        }

        if(flag==true){
            System.out.println("stack is valid...");
        }
        else{
            System.out.println("stack is not valid..");
        }
    }
}