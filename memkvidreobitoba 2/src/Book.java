class Book {
    private String title;
    private int pages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int pages, String author, boolean isHardcover)
    {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public void read()
    {
        System.out.println("im reading " + this.title);
    }

    public String toString()
    {
        return this.title + " " + this.author + " " + this.pages + " " + this.isHardcover;
    }
}