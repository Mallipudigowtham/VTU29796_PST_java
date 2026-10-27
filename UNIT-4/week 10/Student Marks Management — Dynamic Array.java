import java.util.*;

class DynamicMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[2];
        int count = 0;

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (count == marks.length) {
                marks = Arrays.copyOf(marks, marks.length * 2);
            }

            System.out.print("Enter mark: ");
            marks[count++] = sc.nextInt();
        }

        System.out.println("Student marks:");
        for (int i = 0; i < count; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}
