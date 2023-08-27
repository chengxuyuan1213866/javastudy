package opp.Demo0816.Task;

public class BankAccount {
    private Double accountNumber;
    private String accountHolder;
    private Double balance;
    public Double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public BankAccount(double accountNumber,String accountHolder,double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public BankAccount()
    {
        this(10086,"蔡虚坤",2500.0);
    }
    public void savingsAccount(double money)
    {
        this.balance = balance+money;
    }
    public void withdrawMoney(double money)
    {
        if (money>balance)
        {
            System.out.println("输入有误");
            return;
        }
        this.balance = balance-money;
    }

}
