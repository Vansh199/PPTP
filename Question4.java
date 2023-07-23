public class Question4 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean cycle=false;
        while(slow != null && fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(!cycle){
            return null;
        }
        slow=head;
        while(slow != fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        //time complexity:O(n)
        //space complexity:O(1)
    }
}
