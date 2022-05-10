public class Main {
    public static void main(String[] args) {
        //Bank Account Exercise
        BankAccount customer1 = new BankAccount("Stiorra", 500);
        customer1.printAccount();
        customer1.getDeposit(100);
        customer1.printAccount();

        //Bank Transfer Exercise
        BankAccount customer2 = new BankAccount("Brida", 5000);
        BankAccount customer3 = new BankAccount("Alfred", 300);
        customer2.getTransfer(customer3, 100);
        customer2.printAccount();
        customer3.printAccount();

    }
}
