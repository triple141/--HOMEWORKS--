import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String file1 = "leqsi.txt";
        String file2 = "lowercase.txt";
        String file3 = "capital.txt";  //?

        writeToFile(file1,
                "შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,\n" +
                "კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;\n" +
                "კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,\n" +
                "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი");

        int count = countWordsInFile(file1);
        System.out.println(count);


        Scanner scanner = new Scanner(System.in);
        String wordToSearch = scanner.nextLine();
        boolean found = searchWordInFile(file1, wordToSearch);
        System.out.println(found);


//        writeToFile(file2, "Assure polite his real and other figures though. Day age advantages\n" +
//                "and sufficient eating expression traveling. Of on am father by agreed\n" +
//                "supply rather either. Own handsome delicate property mistresses her\n" +
//                "end appetite. Mean are sons too sold nor said. Son share three men\n" +
//                "power by you. Now merits wonder effect garret own."); ?
    }

    private static void writeToFile(String fileName, String text)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
        {
            writer.write(text);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static int countWordsInFile(String fileName)
    {
        try
        {
            String text = new String(Files.readAllBytes(Paths.get(fileName)));
            String[] words = text.split("\\s+");
            return words.length;
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    private static boolean searchWordInFile(String fileName, String word)
    {
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines)
            {
                if (line.contains(word))
                {
                    return true;
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static void mergeFiles(String file1, String file2, String outputFile)
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file1)))
        {
            BufferedReader br = new BufferedReader(new FileReader(file2));
            String line = br.readLine();
            while (line != null)
            {
                pw.println(line);
                line = br.readLine();
            }

            while(line != null)
            {
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
            br.close();
            pw.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}