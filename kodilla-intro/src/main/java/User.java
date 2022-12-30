public class User {
    private String[] name;
    private int[] age;
    private int size;

    public User() {
        this.name = new String[5];
        this.age = new int[5];
        this.size = 0;
    }

    public void addUser(String name, int age ) {
        if (this.size == 5) {
            return;
        }
        this.name[this.size] = name;
        this.age[this.size] = age;
        this.size++;
    }

    public double calcAveAge() {
        int sum = 0;

        for (int i = 0; i < this.size; i++) {
            sum += this.age[i];
        }

        if (this.size > 0) {
            double aveAge = (double) sum / this.size;
            return aveAge;
        }
        return 0;
    }

    public void userList(double aveAge) {
        if (aveAge > 0) {
            for (int i = 0; i < this.size; i++) {
                if (this.age[i] < aveAge) {
                    System.out.println(this.name[i]);
                }
            }
        } else System.out.println("User's base is empty");
    }

    public static void main(String[] args) {

        User user = new User();

        user.addUser("Peter", 18);
        user.addUser("John", 26);
        user.addUser("Jenny", 22);
        user.addUser("Alice", 32);
        user.addUser("Damian", 42);
        user.addUser("Linda", 23);
        user.addUser("Emily", 25);
        user.addUser("Harry", 29);
        user.addUser("Lisa", 33);

        user.userList(user.calcAveAge());
    }
}
