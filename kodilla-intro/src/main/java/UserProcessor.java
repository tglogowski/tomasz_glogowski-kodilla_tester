public class UserProcessor {

    private User[] users;

    public UserProcessor(User[] users) {
        this.users = users;
    }

    private double calcAveAge() {
        double sum = 0;
        if (users.length > 0) {
            for (int i = 0; i < users.length; i++) {
                sum += users[i].getAge();
            }
            return sum / users.length;
        }
        return 0;
    }

    public void printUserNamesYoungerThanAverageAge() {
        double average = calcAveAge();
        for (int j = 0; j < users.length; j++) {
            if (users[j].getAge() < average) {
                System.out.println(users[j].getName());
            }
        }
    }
}
