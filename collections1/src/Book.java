class Book {
    private String name;
    private int pages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.pages = numberOfPages;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "Name='" + name + "', Pages=" + pages;
    }
}