package project.atm;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    private double transferAmount;
    

    //default constructor
    public ATM(){

    }

    //getter setter
public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
    public double getTransferAmount() {
    	return transferAmount;
    }
    
    public void setTransferAmount(double transferAmount) {
    	this.transferAmount = transferAmount;
    }
    
}