import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // savarjisho 1

//        int n,oper,sum = 0;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        boolean bool = true;
//        while(bool)
//        {
//
//            oper = sc.nextInt();
//            for(int i = 0; i<n; i++)
//            {
//                sum+=num[i];
//                if(num[i] == oper)
//                {
//                    num[i] = 0;
//                }
//            }
//
//            for(int i = 0; i<n; i++)
//            {
//                System.out.print(num[i] + " ");
//            }
//            System.out.println();
//            if(sum==0)
//            {
//                bool = false;
//            }
//            sum = 0;
//        }

        //savarjisho 2

//        int n;
//        int oper=-1,buy=0,sell=0;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<n-1; i++)
//        {
//            for (int j=i; j<n; j++)
//            {
//                if(oper>num[i]-num[j])
//                {
//                    oper=num[i]-num[j];
//                    buy = i;
//                    sell = j;
//                }
//            }
//        }
//
//        System.out.println("unda iyido " + buy + " dgeze, da gayido " + sell + " dgeze");




        //savarjisho 3

//        int n;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<n/2; i++)
//        {
//            if(num[i] != num[n-1-i])
//            {
//                System.out.println("araa palindromi");
//                return;
//            }
//        }
//
//        System.out.println("palindromia");

        // savarjisho 4

//        int n,oper,counter = 0;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i<n; i++)
//        {
//            System.out.print(num[i]+" ");
//        }
//
//        System.out.println();
//
//        oper = sc.nextInt();
//        boolean found = false;
//        for(int i = 0; i<n; i++)
//        {
//            if (num[i] == oper)
//            {
//                counter++;
//                found = true;
//            }
//        }
//        int[] num2 = new int[n-counter];
//        int j = 0;
//
//        for(int i = 0; i<n; i++)
//        {
//            if (num[i] == oper)
//            {
//                continue;
//            }
//            else
//            {
//                num2[j]=num[i];
//                j++;
//            }
//        }
//        if(!found)
//        {
//            System.out.println("shesakrebebis povna sheudzlebelia");
//        }
//        System.out.println();
//        for(int i = 0; i<n-counter; i++)
//        {
//            System.out.print(num2[i] + " ");
//        }
    }
}