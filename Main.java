package org.example;

class Node{
    int data ;
    Node next ;

    Node(int data){
        this.data=data ;
        this.next=null ;
    }
}

public class Main{

    public static void main(String[] args){

            int[] arr = {2,1,4,5,3,7,8};
            int node = 10;

            Node head = new Node(arr[0]);
            Node curr = head;

            for(int i = 1;i< arr.length;i++){
                Node newNode = new Node(arr[i]);
                curr.next=newNode;
                curr=newNode;
            }

            if(curr.next==null){
                Node newNode = new Node(node);
                curr.next = newNode;
            }

            Node temp = head;

            while (temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
    }
}