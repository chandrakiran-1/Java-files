import java.util.Scanner;

class Atm {
    private int pin;
    private double bal = 100000;

    // Setter → set your PIN
    public void setPin(int p) {
        pin = p;
        System.out.println("PIN set successfully!");
    }

    // Getter → show balance only if PIN matches
    public double getBal(int enteredPin) {
        if (enteredPin == pin) {
            return bal;
        } else {
            System.out.println(" Wrong PIN! Access Denied.");
            return -1; // return -1 if wrong PIN
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm a = new Atm();

        // Step 1: Set your PIN
        a.setPin(1234);

        // Step 2: Ask user to enter PIN
        System.out.print(" Please enter your PIN: ");
        int userPin = sc.nextInt();

        // Step 3: Show balance if PIN is correct
        double balance = a.getBal(userPin);
        if (balance != -1) {
            System.out.println("Your balance is: " + balance);
        }
    }
}
