import java.util.*;

public class Main {
    public static boolean hasRoute(
            ArrayList<ArrayList<Integer>> graph,
            int source, int destination) {

        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();

        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            if (node == destination)
                return true;

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        System.out.println(
            hasRoute(graph, source, destination) ? "YES" : "NO"
        );

        sc.close();
    }
}
