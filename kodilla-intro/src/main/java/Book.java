class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
            Book book = new Book();
            book.author = author;
            book.title = title;
    return book;
    }

    public static void main(String[] args) {

        Book book = Book.of("Issac Assimov", "The Galaxy");
    }
}
