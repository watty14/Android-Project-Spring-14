package com.example.wallt;

public class BankAccount {

	private int accountNumber;
	private int balance;
	private String bankName;
	
	public BankAccount(int accountNumber, int balance, String bankName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.bankName = bankName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBalance(int amount) {
		balance = amount;
	}
}
