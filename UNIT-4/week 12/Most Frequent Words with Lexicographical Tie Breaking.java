import java.util.*;

public class Main {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int c = Integer.compare(freq.get(a), freq.get(b));

            if (c != 0)
                return c;

            return b.compareTo(a);
        });

        for (String word : freq.keySet()) {
            pq.offer(word);

            if (pq.size() > k)
                pq.poll();
        }

        List<String> result = new ArrayList<>();

        while (!pq.isEmpty())
            result.add(pq.poll());

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        String[] words = {
            "i", "love", "leetcode", "i", "love", "coding"
        };

        System.out.println(topKFrequent(words, 2));
    }
}
