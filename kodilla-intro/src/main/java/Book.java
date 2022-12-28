class Book {
    private String author;
    private String title;

    public static Book of(String author, String title){
            Book books = new Book();
            books.author = author;
            books.title = title;
        System.out.println("Autor książki: " + books.author);
        System.out.println("Tytuł książki: " + books.title);
    return books;
    }

    public static void main(String[] args) {

        Book book = Book.of("Issac Assimov", "The Galaxy");
    }
}
