package org.example;

class Node {
    int data ;
    Node next ;

    Node(int data){
        this.data=data ;
        this.next=null ;
    }
}

 class Main{

    public static void main(String[] args){

        int[] arr={2,4,1,3,5,7};
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1;i<arr.length;i++){
            Node newNode =  new Node(arr[i]);
            current.next=newNode;
            current=newNode;
        }

        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
        }
    }
