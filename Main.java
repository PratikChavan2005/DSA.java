package org.example;

class Node{
    int data;
    Node next;

    Node(int data){
        
        this.next=null;
        this.data=data;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,7,8,3};
        int key = 3;
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i = 1;i< arr.length;i++){
            Node newNode = new Node(arr[i]);
            curr.next=newNode;
            curr=newNode;
        }

        while (curr!=null){
            if(curr.data==key){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");

    }
}