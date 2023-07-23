public class Question5 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        //time complexity:O(n)
        //space complexity:O(1)
    }
}
