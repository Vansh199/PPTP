import java.util.Comparator;
import java.util.PriorityQueue;

public class Question7 {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<>(new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                } else {
                    return a.length() - b.length();
                }
            }
        });

        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
