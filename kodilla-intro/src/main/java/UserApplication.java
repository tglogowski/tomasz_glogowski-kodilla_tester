public class UserApplication {

    public static void main(String[] args) {
        User[] users = initUsers();
        UserProcessor userProcessor = new UserProcessor(users);
        userProcessor.printUserNamesYoungerThanAverageAge();
    }

    private static User[] initUsers() {
        User[] users = new User[5];
        users[0] = new User("Peter", 18);
        users[1] = new User("John", 26);
        users[2] = new User("Jenny", 22);
        users[3] = new User("Alice", 32);
        users[4] = new User("Damian", 42);
        return users;
    }
}
