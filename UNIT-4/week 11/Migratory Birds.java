import java.util.*;

public class Main {
    public static int migratoryBirds(List<Integer> arr) {
        int[] freq = new int[6];

        for (int bird : arr)
            freq[bird]++;

        int max = 0;
        int result = 0;

        for (int i = 1; i <= 5; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> birds = Arrays.asList(1, 4, 4, 4, 5, 3);
        System.out.println(migratoryBirds(birds));
    }
}
