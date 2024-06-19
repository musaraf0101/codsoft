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

        if(avg>=75){
            System.out.println("Student Grade is A");
        }
        else if(avg>=65){
            System.out.println("Student Grade is B");
        }
        else if(avg>=55){
            System.out.println("Student Grade is C");
        }
        else if(avg>=35){
            System.out.println("Student Grade is S");
        }
        else{
            System.out.println("Better Luck next time");
        }
        System.out.println("Total Marks is : "+total);
        System.out.println("Avarage is : "+avg);

        sc.close();
    }
}