public class UserApplication {
    double aveAge;
    User[] user = new User[5];
    public static void main(String[] args) {

        UserApplication run = new UserApplication();

        run.addUsers();
        run.calcAveAge();
        run.printNames();
    }

    private void addUsers(){

        user[0] = new User("Peter", 18);
        user[1] = new User("John", 26);
        user[2] = new User("Jenny", 22);
        user[3] = new User("Alice", 32);
        user[4] = new User("Damian", 42);
    }

    private void  calcAveAge() {

        int sum = 0;
        if (user.length > 0) {
            for (int i = 0; i < user.length; i++) {
                sum += user[i].getAge();
            }
            aveAge = (double) sum / user.length;
        }
    }

    private void printNames() {
             for (int j = 0; j < user.length; j++)
                if (user[j].getAge() < aveAge) {
                    System.out.println(user[j].getName());
                }
    }
}
