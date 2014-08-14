package com.munni.linkedlist;

public class LinkedListTest {
    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
      MyLinkedList linkedList = new MyLinkedList();
      MyLinkedList.Node head = linkedList.head();
      
      linkedList.add( new MyLinkedList.Node("1hello"));
      linkedList.add( new MyLinkedList.Node("2how"));
      linkedList.add( new MyLinkedList.Node("3are"));
      linkedList.add( new MyLinkedList.Node("4you"));
    
      //finding middle element of LinkedList in single pass
      MyLinkedList.Node current = head;
      int length = 0;
      MyLinkedList.Node middle = head;
    
      System.out.println("Current data : "+current.data());
      while(current.next() != null){
          length++;
          if(length%2 ==0){
              middle = middle.next();
              System.out.println("Middle element is "+middle);
              
          }
          current = current.next();
      }
    
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : " + middle);
      
    } 
  
}

class MyLinkedList{
    private Node head;
    private Node tail;
  
    public MyLinkedList(){
        this.head = new Node("head");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
        }
    }
}

