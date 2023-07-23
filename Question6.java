import org.w3c.dom.Node;

public class Question6 {
    public Node rotate(Node head, int k) {
        // add code here
        if (head == null || k == 0) {
            return head;
        }

        int length = 1;
        Node tail = head;

        // Traverse to find the length of the linked list
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Calculate the effective rotation count
        k = k % length;

        if (k == 0) {
            return head;
        }

        // Connect the tail to the head to form a circular linked list
        tail.next = head;

        // Traverse to find the new tail node
        for (int i = 0; i < length - k; i++) {
            tail = tail.next;
        }

        // Set the new head and break the link to form the new list
        Node newHead = tail.next;
        tail.next = null;

        return newHead;
        
    }
   public static void main(String[] args) {
    
   } 
}
