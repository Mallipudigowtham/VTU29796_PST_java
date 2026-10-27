import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Object>> students = new ArrayList<>();
        TreeSet<Double> grades = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double grade = sc.nextDouble();

            students.add(Arrays.asList(name, grade));
            grades.add(grade);
        }

        double secondLowest = grades.higher(grades.first());
        List<String> names = new ArrayList<>();

        for (List<Object> student : students) {
            if ((double) student.get(1) == secondLowest) {
                names.add((String) student.get(0));
            }
        }

        Collections.sort(names);

        for (String name : names)
            System.out.println(name);

        sc.close();
    }
}
