import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        while (q-- > 0) {
            int op = sc.nextInt();
            int x = sc.nextInt();

            if (op == 1) {
                int old = freq.getOrDefault(x, 0);
                int now = old + 1;

                freq.put(x, now);
                count.put(old, count.getOrDefault(old, 0) - 1);
                count.put(now, count.getOrDefault(now, 0) + 1);

            } else if (op == 2) {
                int old = freq.getOrDefault(x, 0);

                if (old > 0) {
                    int now = old - 1;

                    count.put(old, count.get(old) - 1);
                    count.put(now, count.getOrDefault(now, 0) + 1);

                    if (now == 0)
                        freq.remove(x);
                    else
                        freq.put(x, now);
                }

            } else if (op == 3) {
                System.out.println(
                    x > 0 && count.getOrDefault(x, 0) > 0 ? 1 : 0
                );
            }
        }

        sc.close();
    }
}
