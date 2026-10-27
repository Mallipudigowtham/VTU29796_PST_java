import java.util.*;

public class Main {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : nums)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int c = Integer.compare(freq.get(a), freq.get(b));
            return c != 0 ? c : Integer.compare(b, a);
        });

        for (int x : freq.keySet()) {
            pq.offer(x);
            if (pq.size() > k)
                pq.poll();
        }

        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--)
            result[i] = pq.poll();

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
