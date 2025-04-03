import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "suruthi@123";
        
        while (true) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.next();
            
            if (inputPassword.equals(correctPassword)) {
                System.out.println("Password accepted.");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        
        scanner.close();
    }
}
