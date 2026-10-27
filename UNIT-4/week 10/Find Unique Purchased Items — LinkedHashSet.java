import java.util.*;

class UniqueItems {
    public static void main(String[] args) {
        LinkedHashSet<String> items = new LinkedHashSet<>();

        items.add("Laptop");
        items.add("Mobile");
        items.add("Laptop");
        items.add("Mouse");
        items.add("Mobile");
        items.add("Keyboard");

        System.out.println("Unique purchased items: " + items);
    }
}
