import java.util.Scanner;
public class ATM {
    int password = 1234;
    double Account_balance = 5000;
    public static void balance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        int pass = sc.nextInt();
        if(password==pass){
            System.out.println("Your account balance is: "+Account_balance);
        }
        else{
            System.out.println("Incorrect password");
        }
    }
    public static void withdraw(){}
    public static void main(String [] args){
      
    }
}
