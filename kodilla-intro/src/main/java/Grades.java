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

    public void lastAddGrade() {
        System.out.println("Ostanio dodana ocena to: ");
        System.out.println(this.grades[this.size-1]);
    }
    public void disp() {
        System.out.println(size);
    }
    public void averageGrade() {
        int sum = 0;
        float aveG;
        for (int i = 0; i < size; i++) {
            sum = sum + grades[i];
        }
        if (size > 0) {
            aveG = sum / size;
            System.out.println("Średnia z ocen wynosi:" + aveG);
        } else {
            System.out.println("Tablica ocen jest pusta");
        }
    }
}
