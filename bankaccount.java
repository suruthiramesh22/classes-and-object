import java.util.Scanner;
public class bankaccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter your deposite amound: ");
        double deposite = scanner.nextDouble();
        balance+=deposite;

        System.out.print("Enter the amount you wish to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {

            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
        scanner.close();
    }
}