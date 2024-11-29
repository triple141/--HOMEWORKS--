import java.util.Scanner;

public class Main {

//    public static int Sum(int start, int end) {
//        if (start == end) {
//            return start;
//        }
//        else if (start < end){
//            return start + Sum(start + 1, end);
//        }
//        else if (start > end) {
//            return end + Sum(end, start);
//        }
//        return 0;
//    }
//
//    public static int Sumn(int n,int start) {
//        if (start == n) {
//            return start;
//        }
//        return start + Sumn(n,start + 1);
//    }
//
//    public static int Power(int a,int pow) {
//        if (pow == 0) {
//            return a;
//        }
//        return a * Power(a, pow-1);
//    }

        public static int Zero(int n,int count) {
            if (n == 0)
            {
                return count;
            }
            else if (n % 10 == 0)
            {
                return Zero(n / 10, count + 1);
            }
            else
            {
                return Zero(n / 10, count);
            }
        }

        public static boolean Zerohelp(int n)
        {
            if(Zero(n,0) % 2 ==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start,end,n,a,pow;
//        start = sc.nextInt();
//        end = sc.nextInt();
        Car car = new Car("lamborghini", "aventador", 2015,12345678);
        car.printinfo();
//
//        System.out.println(Sum(start,end));
//
//
        n = sc.nextInt();
//        System.out.println(Sumn(n,0));
//
//        a = sc.nextInt();
//        pow = sc.nextInt();
//        System.out.println(Power(a,pow));

        if(Zerohelp(n) == true)
        {
            System.out.println("luwi raodenobaa 0-ebis");
        }
        else
        {
            System.out.println("kenti raodenobaa 0-ebis");
        }
    }
}
