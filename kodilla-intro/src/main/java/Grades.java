import java.util.Arrays;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        return this.grades[this.size-1];
    }

    public double averageGrade() {
        if (size == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < size; i++ ) {
            sum = sum + grades[i];
        }
        return sum / size;
    }

    public static void main(String[] args) {
        Grades grade = new Grades();
        grade.add(4);
        grade.add(6);
        grade.add(6);
        System.out.println("Ostatnia ocena w dzienniku: " + grade.lastGrade());
        System.out.println("Średnia ocen: " + grade.averageGrade());
    }

}
