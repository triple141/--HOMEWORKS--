class Science extends Book {
    private String field;

    public Science(String title, int pages, String author, boolean isHardcover, String field)
    {
        super(title, pages, author, isHardcover);
        this.field = field;
    }

    public String toString() {
        String st = super.toString();
        return st + " " + this.field;
    }
}