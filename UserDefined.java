import java.lang.Exception;
import java.util.Scanner;
public class UserDefined {
    public static void main(String[] args) {
        int balance;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter balance : ");
            balance = s.nextInt();
        }
        try {
            updateBalance(balance);
        } catch (InvalidBalanceException ex) {
            System.out.println("Caught in catch of InvalidBalanceException. ");
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            System.out.println("Caught in catch of NumberFormatException. ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException. ");
        } catch (Exception ex) {
            System.out.println("Caught in catch of Exception. ");
        }
        System.out.println(" Main method executed successfully. ");
    }
    public static void updateBalance(int number) throws InvalidBalanceException {
        if (number < 0) {
            throw (new InvalidBalanceException("Account balance cannot be Negative."));
        }
        System.out.println("No Exception occurred in updateBalance() method");
    }
}
class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}