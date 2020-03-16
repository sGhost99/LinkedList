
package linkedlist;

import java.util.Scanner;


public class LinkedList {

    public static void main(String[] args) {
       
      Node head = new Node(1); 
      Node node_second = new Node(2);  
      Node node_third = new Node(3);  
      Node node_fourth = new Node(4);  
        
        head.next = node_second;
        node_second.next = node_third;
        node_third.next = node_fourth;
        countNodes(head);
        deleteNodes(head);
        addNode(head);
        countNodes(head);
    }
    static int countNodes(Node head){
    
    int count = 1;
    Node current = head;
    while(current.next != null){
    
    current = current.next;
    count = count + 1;
    
    }
    System.out.println("This is how many elements in list exist: " + count);
    return 0;
    }
     static int deleteNodes(Node head){
    System.out.println("Which element you would like to delete?");
    Scanner s = new Scanner(System.in);
   int deleting_element = s.nextInt();
    int count = 1;
    Node current = head;
    while(current.next != null ){
    
    current = current.next;
    count = count + 1;
    if(count == deleting_element){
    
    current.prev = current.next ;
    break;
    }
    
    }
    System.out.println("This is how many elements in list exist after deleting: " + (count-1));
    return 0;
    }
   

     static int addNode(Node head) {
        System.out.println("Which element you would like to add?");
    Scanner s = new Scanner(System.in);
   int adding_element_data = s.nextInt();
   Node node_new = new Node(adding_element_data);
  
   head.prev=node_new;
   return 0;
    
    }

    
    
}
