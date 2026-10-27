import java.util.*;

class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> students = new HashMap<>();

        students.put(101, 85);
        students.put(102, 90);
        students.put(103, 78);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        if (students.containsKey(roll)) {
            System.out.println("Student marks: " + students.get(roll));
        } else {
            System.out.println("Student not found");
        }

        sc.close();
    }
}
