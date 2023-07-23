public class Question2 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val==val){
            head=head.next;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr != null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        //time complexity:O(n)
       //space complexity:O(1)
    }
}
