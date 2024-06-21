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
      Scanner sc = new Scanner(System.in);
      System.out.println("Welcome to ATM");
      System.out.println("1. Check Balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Exit");

      int num = sc.nextInt();
      switch(num){
        case 1: balance();
        break;

        case 2 : withdraw();
        break;

        case 3: deposit();
        break;

        case 4: System.exit(num);
        break;

        default:
        System.out.println("Invalid choice");
      }
      sc.close();
    }
}
