public class Question8 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode odd=head;
        ListNode oddhead=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;
        while(odd != null && odd.next != null && even != null && even.next != null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return oddhead;
    }
    public static void main(String[] args) {
        
    }
}
