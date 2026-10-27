import java.util.*;

public class Main {
    static class Product {
        int id, stock;
        String name;
        double price;

        Product(int id, String name, int stock, double price) {
            this.id = id;
            this.name = name;
            this.stock = stock;
            this.price = price;
        }

        public String toString() {
            return id + " " + name + " " + stock + " " + price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Product> inventory = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int stock = sc.nextInt();
            double price = sc.nextDouble();

            inventory.put(id, new Product(id, name, stock, price));
        }

        // Update stock after sales
        int id = sc.nextInt();
        int sold = sc.nextInt();

        Product p = inventory.get(id);

        if (p != null && sold >= 0 && sold <= p.stock)
            p.stock -= sold;

        // Find products below a threshold
        int threshold = sc.nextInt();

        System.out.println("Low-stock products:");

        for (Product product : inventory.values()) {
            if (product.stock < threshold)
                System.out.println(product);
        }

        // Display products sorted by remaining stock
        List<Product> list = new ArrayList<>(inventory.values());

        list.sort(Comparator.comparingInt((Product x) -> x.stock)
                            .thenComparingInt(x -> x.id));

        System.out.println("Products sorted by stock:");

        for (Product product : list)
            System.out.println(product);

        // Retrieve a product by ID
        int searchId = sc.nextInt();
        Product result = inventory.get(searchId);

        System.out.println("Product details:");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product not found");

        sc.close();
    }
}
