import java.util.Scanner;

public class Number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int number = 1+ (int)(100*Math.random());

        System.out.println("Enter A Number 1 to 100 Range");
        int UserNumber = sc.nextInt();

        if(number==UserNumber){
            System.out.println("Congratulations");
            System.out.println("System Genarate Number" + number);
            System.out.println("User Input Number" + UserNumber);
        }

        else{
            System.out.println("Better Luck Next Time");
        }
    }
}
