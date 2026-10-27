import java.util.*;

class OnlineShopping {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        HashMap<Integer, String> productMap = new HashMap<>();
        PriorityQueue<Integer> orders = new PriorityQueue<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");

        productMap.put(101, "Laptop");
        productMap.put(102, "Mobile");
        productMap.put(103, "Headphones");

        orders.add(3);
        orders.add(1);
        orders.add(2);

        System.out.println("Products: " + products);
        System.out.println("Search ID 102: " + productMap.get(102));

        System.out.println("Orders by priority:");
        while (!orders.isEmpty()) {
            System.out.println(orders.poll());
        }
    }
}
