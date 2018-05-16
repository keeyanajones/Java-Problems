
/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

public class mergeListAlternateFunction {    
// Java program to illustrate merging a linked 
// list into another at alternate positions
    
// head of list    
  Node head;  
 
    /* Linked list Node*/
    class Node {
      int data;
      Node next;
      
      Node(int d) {
          data = d; 
          next = null; 
      }
    }
 
    /* Inserts a new Node at front of the list. */
    void push(int new_data)    {
      /* 1 : Allocate the Node and Put in the data*/
      Node new_node = new Node(new_data); 
      /* 2. Make next of new Node as head */
      new_node.next = head; 
      /* 3. Move the head to point to new Node */
      head = new_node;
    }
 
    // Main function that inserts nodes of linked list q into p at
    // alternate positions. Since head of first list never changes
    // and head of second list may change, we need single pointer
    // for first list and double pointer for second list.
    void merge(mergeListAlternateFunction q)  {
      Node p_curr = head, q_curr = q.head;
      Node p_next, q_next; 
      
      // While there are available positions in p;
      while (p_curr != null && q_curr != null) { 
          // Save next pointers
          p_next = p_curr.next;
          q_next = q_curr.next; 
          
          // make q_curr as next of p_curr
          
          // change next pointer of q_curr
          q_curr.next = p_next; 
          // change next pointer of p_curr 
          p_curr.next = q_curr; 
          
// update current pointers for next iteration
          p_curr = p_next;
          q_curr = q_next;
      }
      q.head = q_curr;
    }
 
    /* Function to print linked list */
    void printList()    {
      Node temp = head;
      while (temp != null)        {
         System.out.print(temp.data+" ");
         temp = temp.next;
      }
      System.out.println();
    }
 
    /* Drier program to test above functions */
    public static void main(String args[])    {
      mergeListAlternateFunction llist1 = new mergeListAlternateFunction();
      mergeListAlternateFunction llist2 = new mergeListAlternateFunction();

      llist1.push(55);      
      llist1.push(44);      
      llist1.push(33);
      llist1.push(22);
      llist1.push(11);

      System.out.println("First Linked List:");
      llist1.printList();
 
      llist2.push(0);
      llist2.push(6);
      llist2.push(7);
      llist2.push(8);
      llist2.push(9);
 
      System.out.println("Second Linked List:"); 
      llist2.printList();
 
      System.out.println("Alternating Linked List:");
       llist1.merge(llist2);
       llist1.printList();       
  }
} 
