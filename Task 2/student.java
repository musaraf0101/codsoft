import java.util.Scanner;
public class student {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int subject = sc.nextInt();

        for( int i=1;i<= subject; i++){
            System.out.println("Enter the marks of" + i + "subject : ");
        }
        
    }
}
