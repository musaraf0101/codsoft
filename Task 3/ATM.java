import java.util.Scanner;
public class ATM {
    static double  password = 1234;
    static double Account_balance = 5000;
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
        sc.close();
    }
    public static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        int pass = sc.nextInt();
        if(password == pass){
            System.out.println("Enter the amount you want to withdraw: ");
            double amount = sc.nextDouble();
            if(Account_balance>0&&Account_balance>=amount){
                System.out.println("Your Withdraw Amount" +amount +"Succes!!");
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        sc.close();
    }

    public static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        int pass = sc.nextInt();
        if(password==pass){
            System.out.println("Enter your Deposit Amount");
            double amount = sc.nextDouble();
            Account_balance = Account_balance + amount;
        }
        sc.close();
    }
    public static void main(String [] args){
      
    }
}
