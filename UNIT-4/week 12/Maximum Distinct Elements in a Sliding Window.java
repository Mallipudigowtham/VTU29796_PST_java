import java.util.*;

public class Main {
    public static int maxDistinct(int[] arr, int k) {
        if (k <= 0 || k > arr.length)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (i >= k) {
                int old = arr[i - k];
                map.put(old, map.get(old) - 1);

                if (map.get(old) == 0)
                    map.remove(old);
            }

            if (i >= k - 1)
                max = Math.max(max, map.size());
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println(maxDistinct(arr, k));
    }
}
