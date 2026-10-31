package org.example;

import javax.crypto.SecretKey;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{

    public static boolean SearchKey(Node head, int key){
        if(head==null){
            return false;
        }
        if(head.data==key){
            return true;
        }
      return SearchKey(head.next,key);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 8, 6, 3, 7};
        int key = 5;
        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            curr=newNode;

        }
        System.out.println(SearchKey(head, key));

    }
}