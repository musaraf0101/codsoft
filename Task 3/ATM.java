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
    public static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        int pass = sc.nextInt();
        if(password == pass){
            System.out.println("Enter the amount you want to withdraw: ");
            if(Account_balance>0&&Account_balance>amount){
                double amount = sc.nextDouble();
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
    }
    public static void main(String [] args){
      
    }
}
