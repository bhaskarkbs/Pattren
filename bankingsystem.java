import java.util.Scanner;
public class bankingsystem {
    public static void main(String[] args) 
        int n=1;
        
        double balance;0.0;
        while (true) {
            System.out.println("banking system!");
            System.out.println(" Check balance");
            System.out.println(" Deposit");
            System.out.println(" Withdraw");
            System.out.println(" Exit");
            System.out.print("Enter your choice: ");

            int  = scanner.nextInt();

            switch (n) {
                       case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                       case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();    
                    if (deposit > 0) {
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;
                          case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! New balance: $" + balance);
                    } else {
                        System.out.println("Insufficient funds or invalid amount!");
                    }
                    break;
                        case 4:
                    System.out.println("Thank you for using Simple Bank!");
                    
                    break;
                    default:
                    System.out.println("Invalid choice!");
            }
    }
    }


        
    }
}
