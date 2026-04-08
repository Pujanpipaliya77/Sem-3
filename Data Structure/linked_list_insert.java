import java.util.*;

class Node{
    int info;
    Node link;

    Node(int data){
        this.info = data;
        this.link = null;
    }
}

class Insertmethod{
    Node first;

    void insertatfirst(int data){

        Node newnode = new Node(data);

        if(first==null){
            first = newnode;
        }
        else{

            Node temp = first;
            first = newnode;
            first.link = temp;
        }
    }

    void display(){
        Node temp = first

        while(temp!=null){
            temp = link.data
            temp = link.temp
        }
    }
}

public class linked_list_insert{
    public static void main(String[] args){

        Insertmethod insert = new Insertmethod();

        insert.insertatfirst(100);
        insert.insertatfirst(100);
        insert.insertatfirst(100);
        insert.insertatfirst(100);
    }
}