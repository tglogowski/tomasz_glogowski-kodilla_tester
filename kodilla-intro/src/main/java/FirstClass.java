public class FirstClass{
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2019);

        System.out.println("notebook.weight: " + notebook.weight);
        System.out.println("notebook.price: " + notebook.price);
        System.out.println("Year of production: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        System.out.println();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2021);

        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight);
        System.out.println("heavyNotebook.price: " + heavyNotebook.price);
        System.out.println("Year of production: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();
        System.out.println();

        Notebook oldNotebook = new Notebook(1200, 500, 2018);

        System.out.println("oldNotebook.weight: " + oldNotebook.weight);
        System.out.println("oldNotebook.price: " + oldNotebook.price);
        System.out.println("Year of production: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
        System.out.println();

        Notebook aNotebook = new Notebook(2200, 450, 2017);

        System.out.println("aNotebook.weight: " + aNotebook.weight);
        System.out.println("aNotebook.price: " + aNotebook.price);
        System.out.println("Year of production: " + aNotebook.year);
        aNotebook.checkPrice();
        aNotebook.checkWeight();
        aNotebook.checkYearAndPrice();
        System.out.println();

        Notebook bNotebook = new Notebook(1800, 900, 2022);

        System.out.println("bNotebook.weight: " + bNotebook.weight);
        System.out.println("bNotebook.price: " + bNotebook.price);
        System.out.println("Year of production: " + bNotebook.year);
        bNotebook.checkPrice();
        bNotebook.checkWeight();
        bNotebook.checkYearAndPrice();
        System.out.println();
    }
}
