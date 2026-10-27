import java.util.*;

class ContactDirectory {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Ravi", "9876543210");
        contacts.put("Kiran", "9876501234");
        contacts.put("Arun", "9123456780");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter contact name to search: ");
        String name = sc.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Phone number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found");
        }

        System.out.print("Enter name to update: ");
        String updateName = sc.nextLine();

        if (contacts.containsKey(updateName)) {
            System.out.print("Enter new phone number: ");
            String newNumber = sc.nextLine();

            contacts.put(updateName, newNumber);

            System.out.println("Contact updated successfully");
            System.out.println(updateName + ": " + contacts.get(updateName));
        } else {
            System.out.println("Contact not found");
        }

        sc.close();
    }
}
