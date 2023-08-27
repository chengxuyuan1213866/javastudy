package com.kfm.opp.Demo0816.Task;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        opp.Demo0816.Task.BankAccount a = new opp.Demo0816.Task.BankAccount();
        System.out.println(a.getAccountNumber());
        System.out.println(a.getAccountHolder());
        System.out.println(a.getBalance());
        a.savingsAccount(25.0);
        System.out.println(a.getBalance());
        a.withdrawMoney(250.0);
        System.out.println(a.getBalance());


    }
}
