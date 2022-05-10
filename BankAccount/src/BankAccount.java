public class BankAccount {
    private double accountBalance;
    public String accountHolderName;

    public BankAccount (String initialName, double initialBalance){
        this.accountHolderName = initialName;
        this.accountBalance = initialBalance;
    }

    public double getDeposit(double addDeposit){
        return accountBalance += addDeposit;
    }

    public double getWithdrawal(double subtractWithdraw){
        return accountBalance -= subtractWithdraw;
    }

    public void printAccount(){
        System.out.println(accountHolderName+"'s account balance: "+accountBalance);
    }


}
