import java.util.*;

public class Main {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            freq.put(x, freq.getOrDefault(x, 0) + 1);
            first.putIfAbsent(x, i);
            last.put(x, i);
        }

        int degree = 0;
        int minLength = nums.length;

        for (int x : freq.keySet()) {
            int count = freq.get(x);
            int length = last.get(x) - first.get(x) + 1;

            if (count > degree) {
                degree = count;
                minLength = length;
            } else if (count == degree) {
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
