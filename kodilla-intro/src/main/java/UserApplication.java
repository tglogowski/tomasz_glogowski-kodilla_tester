public class UserApplication {
    static User[] user = new User[5];
    static double aveAge;
    public static void main(String[] args) {

        addUsers();
        aveAge = calcAveAge();
        printNames();
    }

    private static void addUsers(){

        user[0] = new User("Peter", 18);
        user[1] = new User("John", 26);
        user[2] = new User("Jenny", 22);
        user[3] = new User("Alice", 32);
        user[4] = new User("Damian", 42);
    }

    private static double calcAveAge() {

        int sum = 0;
        if (user.length > 0) {
            for (int i = 0; i < user.length; i++) {
                sum += user[i].getAge();
            }
            return (double) sum / user.length;
        }
        return 0;
    }
    private static void printNames(){
             for (int j = 0; j < user.length; j++)
                if (user[j].getAge() < aveAge) {
                    System.out.println(user[j].getName());
                }
    }
}
