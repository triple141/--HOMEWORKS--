import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1)
//        String s = sc.nextLine();
//        int count=0;
//        for(int i = 0; i<s.length(); i++)
//        {
//            if(Character.isDigit(s.charAt(i)))
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //2)
//        String text = sc.nextLine();
//        int count=0;
//        for(int i = 0; i<text.length(); i++)
//        {
//            if(text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?' || text.charAt(i) == ';')
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //3)
//        String s = sc.nextLine();
//        String scopy = s;
//        StringBuilder rev = new StringBuilder();
//        rev.append(s);
//        rev.reverse();
//        for(int i = 0; i<s.length(); i++)
//        {
//            if(s.charAt(i) != scopy.charAt(i))
//            {
//                System.out.println("araa palindromi");
//                return;
//            }
//        }
//        System.out.println("palindromia");

        //4)
//        String S = sc.nextLine();
//        String s = sc.nextLine();
//        int n = S.length();
//        int m = s.length();
//
//        for (int i = 0; i <=n-m; i++)
//        {
//            int j;
//            for (j = 0; j < m; j++)
//            {
//                if (S.charAt(i + j) != s.charAt(j))
//                {
//                    break;
//                }
//            }
//            if (j == m)
//            {
//                System.out.println("substringia");
//                return;
//            }
//        }
//        System.out.println("araa substringi");

        //5)
//        String text = sc.nextLine();
//        if(text.charAt(text.length()-1) == 'a' || text.charAt(text.length()-1) == 'e' || text.charAt(text.length()-1) == 'i' || text.charAt(text.length()-1) == 'o' || text.charAt(text.length()-1) == 'u')
//        {
//            System.out.println("mtavrdeba xmovanze");
//            return;
//        }
//        else
//        {
//            System.out.println("mtavrdeba tanxmovanze");

        // 6.
//        String word = sc.nextLine();
//        StringBuilder original = new StringBuilder();
//        for (int i = 0; i < word.length(); i++)
//        {
//            if (i == 0 || word.charAt(i) != word.charAt(i - 1))
//            {
//                original.append(word.charAt(i));
//            }
//        }
//        System.out.println(original.toString());

        // 7.
//        String word = sc.nextLine();
//
//        if (word.length() > 10)
//        {
//            String abbreviation = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
//            System.out.println(abbreviation);
//        }
//        else
//        {
//            System.out.println("sityva araa uzarmazari");
//        }
    }
}