import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBookApp {
    private static final int Max_Contacts = 30;
    private static final Scanner sc = new Scanner(System.in);
    private static final Data data = new Data();
    private ArrayList<PhoneContact> contacts;

    public PhoneBookApp() throws IOException, ClassNotFoundException
    {
        contacts = data.deserializeContacts();
        if (contacts == null)
        {
            contacts = new ArrayList<>();
        }
    }

    public void run() throws IOException, ClassNotFoundException {
        while (true)
        {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. List Contacts");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    listContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Number choice, try again.");
            }
        }
    }

    private void addContact() throws IOException
    {
        if (contacts.size() >= Max_Contacts)
        {
            System.out.println("No Memory Left.");
            return;
        }

        System.out.print("First name: ");
        String firstName = sc.next();
        System.out.print("Last name: ");
        String lastName = sc.next();
        System.out.print("Phone number: ");
        String phoneNumber = sc.next();
        System.out.print("Email: ");
        String email = sc.next();

        contacts.add(new PhoneContact(firstName, lastName, phoneNumber, email));
        data.serializeContacts(contacts);
        System.out.println("Contact added.");
    }

    private void removeContact() throws IOException, ClassNotFoundException
    {
        listContacts();
        if (contacts.isEmpty())
        {
            return;
        }

        System.out.print("Enter the number of the contact you want to remove: ");
        int index = sc.nextInt();
        if (index >= 1 && index <= contacts.size())
        {
            contacts.remove(index - 1);
            data.serializeContacts(contacts);
            System.out.println("Contact removed.");
        }
        else
        {
            System.out.println("Invalid Number.");
        }
    }


    private void editContact() throws IOException, ClassNotFoundException {
        listContacts();
        if (contacts.isEmpty()) return;

        System.out.print("Enter the Number of the contact you want to edit: ");
        int index = sc.nextInt();
        if (index >= 1 && index <= contacts.size())
        {
            PhoneContact contact = contacts.get(index-1);
            System.out.println(contact);

            System.out.print("Enter new First name, (Enter to keep old): ");
            String firstName = sc.nextLine();
            if(firstName.isEmpty())
            {
                firstName=contact.getFirstName();
            }
            System.out.print("Enter new Last name, (Enter to keep old): ");
            String lastName = sc.nextLine();
            if(lastName.isEmpty())
            {
                lastName=contact.getLastName();
            }
            System.out.print("Enter new Phone number, (Enter to keep old): ");
            String phoneNumber = sc.nextLine();
            if(phoneNumber.isEmpty())
            {
                phoneNumber=contact.getPhoneNumber();
            }
            System.out.print("Enter new Email, (Enter to keep current): ");
            String email = sc.nextLine();
            if(email.isEmpty())
            {
                email=contact.getEmail();
            }

            contact.setFirstName(firstName);
            contact.setLastName(lastName);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);

            data.serializeContacts(contacts);
            System.out.println("Contact updated.");
        }
        else
        {
            System.out.println("Invalid Number.");
        }
    }

    private void listContacts() {
        if (contacts.isEmpty())
        {
            System.out.println("No contacts found.");
            return;
        }

        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println((i) + ". " + contacts.get(i));
        }
    }
}