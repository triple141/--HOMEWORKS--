import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[5];

        student[0] = new Student("zura","zurabishvili",15,6,7.8);
        student[1] = new Student("qeti","bregvadze",16,6,9.6);
        student[2] = new Student("mirza","shanidze",16,6,9.9);
        student[3] = new Student("achi","shukakidze",16,6,6.3);
        student[4] = new Student("shota","lejava",17,6,7.5);


    }
    public static void smartest(Student[] arr)
    {
        double max = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if(max<arr[i].getGrades())
            {
                max = arr[i].getGrades();
            }
        }

        for (int i = 0; i<arr.length; i++)
        {
            if(max==arr[i].getGrades())
            {
                System.out.println(arr[i].getName());
                System.out.println(arr[i].getSurname());
            }
        }
    }
}