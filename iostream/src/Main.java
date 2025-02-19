import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first person's information - ");
        String firstName1 = sc.next();
        String lastName1 = sc.next();
        int age1 = sc.nextInt();
        Human h1 = new Human(firstName1, lastName1, age1);

        try (ObjectOutputStream objos = new ObjectOutputStream(new FileOutputStream("human.txt")))
        {
            objos.writeObject(h1);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream objis = new ObjectInputStream(new FileInputStream("human.txt")))
        {
            Human saved = (Human) objis.readObject();
            System.out.println(saved.getFirstName() + " " + saved.getLastName());
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        h1.walk();
        sc.close();
    }
}