import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //savarjisho 1-2

//        int sum=0;
//        long multiply=1;
//        double midnum;
//
//        int[] b = new int[12];
//        for(int i = 0; i<12; i++)
//        {
//            int random = (int) (100 * Math.random());;
//            b[i] = random;
//        }
//
//        for(int i = 0; i<12; i++)
//        {
//            System.out.print(b[i]);
//
//            System.out.print(" ");
//
//            sum+=b[i];
//            multiply*=b[i];
//        }
//        System.out.println();
//
//        midnum = (double) sum/12;
//
//        System.out.println(sum + "   " + multiply + "   " + midnum);


        //savarjisho 3

//        int[] b = new int[20];
//
//        for(int i = 0; i < 20; i++)
//        {
//            int random = (int)(20 * Math.random());
//            b[i] = random;
//        }
//
//        int max = b[0];
//        int min = b[0];
//
//        for(int i = 0; i<20; i++)
//        {
//            System.out.print(b[i]);
//            System.out.print(' ');
//
//            if(max<b[i])
//            {
//                max = b[i];
//            }
//
//            if(min>b[i])
//            {
//                min = b[i];
//            }
//        }
//        System.out.println();
//        System.out.println(max);
//        System.out.println(min);

            // savarjisho 4-5
//        int n;
//        int sum=0;
//        long multiply=1;
//        double midnum;
//
//        n = sc.nextInt();
//        int[] num = new int[n];
//
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = i+1;
//            sum+=num[i];
//            multiply*=num[i];
//        }
//        for(int i=0; i<n; i++)
//        {
//            System.out.print(num[i]);
//            System.out.print(' ');
//        }
//
//        midnum = (double) sum/n;
//
//        System.out.println();
//        System.out.println(sum + " " + multiply + " " +midnum);


        // savarjisho 6

//        int n;
//        n = sc.nextInt();
//        int[] num = new int[n];
//
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        int oper = sc.nextInt();
//        boolean find = false;
//
//        for(int i=0; i<n; i++)
//        {
//            if(oper == num[i])
//            {
//                System.out.println(oper + " aris " + i + " indeqsze");
//                find = true;
//            }
//        }
//
//        if(!find)
//        {
//            System.out.println("araa masivshi " + oper);
//        }



        // savarjisho 7

//        int n,oper;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        oper = sc.nextInt();
//        int[] numstart = new int[n+1];
//        int[] numend = new int[n+1];
//
//        numstart[0] = oper;
//        numend[n] = oper;
//        for(int i = 1; i<=n; i++)
//        {
//            int j = i-1;
//            numstart[i] = num[j];
//            numend[i-1] = num[j];
//        }
//
//        for (int i = 0; i <= n; i++)
//        {
//            System.out.print(numstart[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i <= n; i++)
//        {
//            System.out.print(numend[i] + " ");
//        }


        // savarjisho 8

//        int n,oper;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
//
//        oper = sc.nextInt();
//        boolean found = false;
//        for(int i = 0; i<n; i++)
//        {
//            for(int j=0; j<n; j++)
//            {
//                if (num[i] + num[j] == oper && i!=j)
//                {
//                    System.out.println(num[i] +  " + " + num[j] + " = " + oper);
//                    found = true;
//                }
//            }
//        }
//        if(!found)
//        {
//            System.out.println("shesakrebebis povna sheudzlebelia");
//        }


        // savarjisho 9


//        int n,oper,counter = 0;
//        n = sc.nextInt();
//        int[] num = new int[n];
//        for(int i = 0; i<n; i++)
//        {
//            num[i] = sc.nextInt();
//        }
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

        // savarjisho 10

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

    }
}