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

    void insertatlast(int data){

        Node newnode = new Node(data);

        if(first==null){
            first=newnode;
        }
        else{
            Node save = first;

            while(save.link!=null){
                save = save.link;

            }
            save.link = newnode;
        }
    }

    void orderedlist(int data){

        Node newnode = new Node(data);

        if(first==null || newnode.info<=first.info){
            newnode.link = first;
            first = newnode;
        }
        else{
            Node save = first;

            while(save.link!=null && newnode.info>=save.link.info){
                save = save.link;
            } 
        }
    }

    void deletenode(int data){

        if(first==null){
            System.out.print("stack is underfloww..");

        }
        else{
            Node save = first; 
            Node x;
            Node prev = null;

            while(save.info!=x && save!=null){
                prev = save;    
                save = save.link;
            }

            if(temp==null){
                System.out.println("node not found..");
            }

            prev.link = temp.link;
        }
    }

    void display(){
        Node temp = first;

        while(temp!=null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}

public class Lab_10{
    public static void main(String[] args){

        Insertmethod insert = new Insertmethod();

        insert.insertatfirst(100);
        insert.insertatlast(50);
        insert.orderedlist(60);
        insert.orderedlist(300);
        insert.insertatlast(90);
        insert.insertatfirst(400);
        insert.orderedlist(80);
        insert.deletenode(400);
        insert.display();
    }
}