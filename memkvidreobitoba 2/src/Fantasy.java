class Fantasy extends Book {
    private String country;

    public Fantasy(String title, int pages, String author, boolean isHardcover, String country)
    {
        super(title, pages, author, isHardcover);
        this.country = country;
    }

    public String toString()
    {
        String st = super.toString();
        return st + " " + this.country;
    }
}