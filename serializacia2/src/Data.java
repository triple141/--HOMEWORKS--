import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class Data {
    private static final String File = "contacts.txt";

    public void serializeContacts(ArrayList<PhoneContact> contacts) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File)))
        {
            oos.writeObject(contacts);
        }
    }

    public ArrayList<PhoneContact> deserializeContacts() throws IOException, ClassNotFoundException
    {
        File file = new File(File);
        if (!file.exists())
        {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File)))
        {
            return (ArrayList<PhoneContact>) ois.readObject();
        }
    }
}