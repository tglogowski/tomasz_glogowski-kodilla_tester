public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2018);
        System.out.println("notebook.weight: " + notebook.weight);
        System.out.println("notebook.price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndAge();
        System.out.println();

        Notebook heavyNotebook = new Notebook(2000,1500, 2019);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight);
        System.out.println("heavyNotebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndAge();
        System.out.println();

        Notebook oldNotebook = new Notebook(1200, 500, 2014);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight);
        System.out.println("oldNotebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndAge();
        System.out.println();

        Notebook newNotebook = new Notebook(1200, 2500, 2022);
        System.out.println("newNotebook.weight: " + newNotebook.weight);
        System.out.println("newNotebook.price: " + newNotebook.price);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkPriceAndAge();
    }
}
