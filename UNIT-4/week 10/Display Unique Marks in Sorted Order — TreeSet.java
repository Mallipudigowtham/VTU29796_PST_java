import java.util.*;

class SortedMarks {
    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(90);
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);

        System.out.println("Unique sorted marks: " + marks);
    }
}
