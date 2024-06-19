import java.util.Scanner;
public class student{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Subject Marks");
        double subject_1 = sc.nextDouble();
        System.out.println("Enter Second  Subject Marks");
        double subject_2 = sc.nextDouble();
        System.out.println("Enter Third Subject Marks");
        double subject_3 = sc.nextDouble();
        System.out.println("Enter fouth subject marks");
        double subject_4 = sc.nextDouble();

        double total = subject_1+subject_2+subject_3+subject_4;
        double avg = total/4;
        System.out.println("Total Marks is : "+total);
        System.out.println("Avarage is : "+avg);

        sc.close();
    }
}