class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void printYoungUsers(User[] user) {
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
