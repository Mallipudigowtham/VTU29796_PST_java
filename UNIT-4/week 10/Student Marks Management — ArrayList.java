import java.util.*;

class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(95);
        marks.add(88);

        System.out.println("Marks: " + marks);

        int highest = Collections.max(marks);
        double average = 0;

        for (int mark : marks) {
            average += mark;
        }

        average /= marks.size();

        System.out.println("Highest mark: " + highest);
        System.out.println("Average mark: " + average);
    }
}
