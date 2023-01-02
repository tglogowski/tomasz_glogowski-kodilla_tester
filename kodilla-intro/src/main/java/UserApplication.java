public class UserApplication {

    public static void main(String[] args) {

        User[] user = new User[5];

        user[0] = new User("Peter", 18);
        user[1] = new User("John", 26);
        user[2] = new User("Jenny", 22);
        user[3] = new User("Alice", 32);
        user[4] = new User("Damian", 42);

        double average = User.printYoungUsers(user);

        User.printNames(user, average);
    }
}