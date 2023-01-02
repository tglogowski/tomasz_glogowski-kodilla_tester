class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static double printYoungUsers(User[] user) {
        int sum = 0;

        if (user.length > 0) {
            for (int i = 0; i < user.length; i++) {
                sum += user[i].age;
            }
            return (double) sum / user.length;
        }
        return 0;
    }

    public static void printNames(User[] user, double ave){
             for (int j = 0; j < user.length; j++)
                if (user[j].age < ave) {
                    System.out.println(user[j].name);
                }
    }
}
