public class BankAccount {
    private double accountBalance;
    public String accountHolderName;

    public BankAccount (String initialName, double initialBalance){
        this.accountHolderName = initialName;
        this.accountBalance = initialBalance;
    }

    public double getDeposit(double addDeposit){
        accountBalance += addDeposit;
        return addDeposit;
    }

    public double getWithdrawal(double subtractWithdraw){
        accountBalance -= subtractWithdraw;
        return subtractWithdraw;
    }

    public double getTransfer(BankAccount transferMoney, double amount){
        double withdrawMoneyTransfer = this.getWithdrawal(amount);
        return transferMoney.getDeposit(withdrawMoneyTransfer);
    }

    public void printAccount(){
        System.out.println(accountHolderName+"'s account balance: "+accountBalance);
    }


}
