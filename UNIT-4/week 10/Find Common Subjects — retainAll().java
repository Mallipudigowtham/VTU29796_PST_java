import java.util.*;

class CommonSubjects {
    public static void main(String[] args) {
        ArrayList<String> student1 = new ArrayList<>(
            Arrays.asList("Java", "Python", "DBMS", "OS")
        );

        ArrayList<String> student2 = new ArrayList<>(
            Arrays.asList("Python", "DBMS", "Networks", "Java")
        );

        student1.retainAll(student2);

        System.out.println("Common subjects: " + student1);
    }
}
