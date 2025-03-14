import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //1)b
        //2)a
        //3)a,d
        //4)c
        //5)a,c
        //6)b
        //7)c
        //8)b
        //9)b
        //10)c
        //11)c
        //12)b
        //13)a,b,c,d
        //14)b,d
        //15)a,d

        String inputFilePath = "students.txt";
        String outputFilepath = "students.data";
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String firstName = data[1].trim();
                String lastName = data[2].trim();
                int year = Integer.parseInt(data[3].trim());
                double gpa = Double.parseDouble((data[4].trim()));
                String subjects = data[5].trim();
                Student student = new Student(id, firstName, lastName, year, gpa, subjects);
                students.add(student);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return;
        }
        Collections.sort(students);  // ?  )-;
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFilepath)))
        {
            outputStream.writeObject(students);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return;
        }


        List<Student> deserializedStudents = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFilepath)))
        {
            deserializedStudents = (List<Student>) inputStream.readObject();
        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
            return;
        }

        if(deserializedStudents != null)
        {
            for (Student student : deserializedStudents)
            {
                System.out.println(student);
            }
        }
    }
}