import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.next();
            map.put(tag, map.getOrDefault(tag, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            int c = map.get(b).compareTo(map.get(a));
            return c != 0 ? c : a.compareTo(b);
        });

        for (String tag : list)
            System.out.println(tag + " " + map.get(tag));

        sc.close();
    }
}
