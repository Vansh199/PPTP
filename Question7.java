import java.util.HashMap;

public class Question7 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        int sum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();

        while (current != null) {
            sum += current.val;

            if (sum == 0) {
                dummy.next = current.next;
                map.clear();
            } else if (map.containsKey(sum)) {
                map.get(sum).next = current.next;
            } else {
                map.put(sum, current);
            }

            current = current.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
