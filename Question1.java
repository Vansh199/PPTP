public class Question1{
    public void deleteNode(ListNode node) {
        int temp=node.val;
        node.val=node.next.val;
        node.next.val=temp;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        //time complexity:O(1)
        //space complexity:O(1)
    }
}