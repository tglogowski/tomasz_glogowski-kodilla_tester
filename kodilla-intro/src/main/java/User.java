class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User[] user = new User[5];
        user[0] = new User("Peter", 18);
        user[1] = new User("John", 26);
        user[2] = new User("Jenny", 22);
        user[3] = new User("Alice", 32);
        user[4] = new User("Damian", 42);

        int sum = 0;

        if (user.length > 0) {
            for (int i = 0; i < user.length; i++) {
                sum += user[i].age;
            }
            double aveAge = (double) sum / user.length;

            for (int j = 0; j < user.length; j++) {
                if (user[j].age < aveAge) {
                    System.out.println(user[j].name);
                }
            }
        }
    }
}