import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // magic scuare

//        int n,oper = 0,counter = 0;
//        n = sc.nextInt();
//        int[][] num = new int[n][n];
//        for(int i = 0; i<n; i++)
//        {
//            for(int j = 0; j<n; j++)
//            {
//                num[i][j] = sc.nextInt();
//            }
//        }
//
//
//        for(int i = 0; i<n; i++)
//        {
//            for(int j = 0; j<n; j++)
//            {
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for(int i = 0; i<n; i++)
//        {
//            oper += num[i][0];
//        }
//
//        //striqonebi
//
//        for(int i = 0; i<n; i++)
//        {
//            for(int j = 0; j<n; j++)
//            {
//                counter += num[i][j];
//            }
//            if(counter!=oper)
//            {
//                System.out.println("araa magiuri kvadrati");
//                return;
//            }
//            counter = 0;
//        }
//
//        //svetebi
//        for(int j = 0; j<n; j++)
//        {
//            for(int i = 0; i<n; i++)
//            {
//                counter += num[i][j];
//            }
//            if(counter!=oper)
//            {
//                System.out.println("araa magiuri kvadrati");
//                return;
//            }
//            counter = 0;
//        }
//
//        //1-li diagonali
//        for(int j = 0; j<n; j++)
//        {
//            counter += num[j][j];
//        }
//        if(counter!=oper)
//        {
//            System.out.println("araa magiuri kvadrati");
//            return;
//        }
//        counter = 0;
//
//        // 2-e diagonali
//        for(int j = 0; j<n; j++)
//        {
//            counter += num[j][n-1-j];
//        }
//        if(counter!=oper)
//        {
//            System.out.println("araa magiuri kvadrati");
//            return;
//        }
//        else
//        {
//            System.out.println("magiuri kvadratia");
//        }

        //


        int n,oper = 0,counter = 0;
        n = sc.nextInt();
        int[][] num = new int[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                num[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i<n; i++)
        {
            oper += num[i][0];
        }


        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                counter += num[i][j];
            }
            if(counter!=oper)
            {
                System.out.println("araa magiuri kvadrati");
                return;
            }
            counter = 0;
        }

        for(int j = 0; j<n; j++)
        {
            for(int i = 0; i<n; i++)
            {
                counter += num[i][j];
            }
            if(counter!=oper)
            {
                System.out.println("araa magiuri kvadrati");
                return;
            }
            counter = 0;
        }

        for(int j = 0; j<n; j++)
        {
            counter += num[j][j];
        }
        if(counter!=oper)
        {
            System.out.println("araa magiuri kvadrati");
            return;
        }
        counter = 0;
        
        for(int j = 0; j<n; j++)
        {
            counter += num[j][n-1-j];
        }
        if(counter!=oper)
        {
            System.out.println("araa magiuri kvadrati");
            return;
        }
        else
        {
            System.out.println("magiuri kvadratia");
        }
    }
}