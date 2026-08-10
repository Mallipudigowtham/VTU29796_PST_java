import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        students.sort((a, b) -> {
            // 1. CGPA: decreasing
            int cmp = Double.compare(b.cgpa, a.cgpa);
            if (cmp != 0) {
                return cmp;
            }

            // 2. Name: alphabetical order
            cmp = a.name.compareTo(b.name);
            if (cmp != 0) {
                return cmp;
            }

            // 3. ID: increasing
            return Integer.compare(a.id, b.id);
        });

        for (Student student : students) {
            System.out.println(student.name);
        }

        sc.close();
    }
}
