public class Main {
    public static void main(String[] args)
    {
        Library library = new Library("Main Library");

        Cleaner cleaner = new Cleaner("Anatoly", "idk", 9999);

        BookGiver issuer = new BookGiver("Marry", "Poppins", 8888, 10, 19);

        BookSugest advisor = new BookSugest("read", "me", 4444, 9.9, library);

        Controller controller = new Controller("Mr", "Controller", 1001, 7.2);

        library.addEmployee(cleaner);

        library.addEmployee(issuer);

        library.addEmployee(controller);

        library.addEmployee(advisor);

        Fantasy fantasyBook = new Fantasy("Harry potter", 2341, "J.K.Rowling", true, "U.K");

        Adventure adventureBook = new Adventure("80000km underwater", 1234, "Jules verne", true);

        Science scienceBook = new Science("A Science easily", 5678, "anonimous", false, "Science");

        library.addBook(fantasyBook);
        library.addBook(adventureBook);
        library.addBook(scienceBook);

        System.out.println(library);

        Book recommendedBook = advisor.recommendBook();

        if (recommendedBook != null)
        {
            System.out.println("Recommended Book: " + recommendedBook);
        }
        else
        {
            System.out.println("we dont have any books.");
        }
    }
}