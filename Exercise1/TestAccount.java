package QAPS.QAP1Java.Exercise1;

public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("1", "Brian", 5000);
        Account acc2 = new Account("2", "John", 4000);


        System.out.println("");
        // Display initial balances
        System.out.println("Initial balances:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());

        // Transfer $1000 from account 1 to account 2
        acc1.transferTo(acc2, 1000);

        // Display final balances
        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());
    }
}