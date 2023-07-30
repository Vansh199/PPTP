import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Question6 {
    ublic List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        // Use a priority queue (min-heap) to store words based on frequency and lexicographical order
        PriorityQueue<String> minHeap = new PriorityQueue<>(new Comparator<String>() {
            public int compare(String a, String b) {
                if (frequencyMap.get(a).equals(frequencyMap.get(b))) {
                    return b.compareTo(a);
                } else {
                    return frequencyMap.get(a) - frequencyMap.get(b);
                }
            }
        });

        for (String word : frequencyMap.keySet()) {
            minHeap.offer(word);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Retrieve the k most frequent words from the minHeap in reverse order
        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(0, minHeap.poll());
        }

        return result;
    }
}
