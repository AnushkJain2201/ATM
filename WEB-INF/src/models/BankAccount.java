package models;


public class BankAccount {
    private Integer BankAccount;
    private ATM atm;
    private Integer balance;

    public Integer getBankAccount() {
        return BankAccount;
    }
    public void setBankAccount(Integer bankAccount) {
        BankAccount = bankAccount;
    }
    public ATM getAtm() {
        return atm;
    }
    public void setAtm(ATM atm) {
        this.atm = atm;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    
}
