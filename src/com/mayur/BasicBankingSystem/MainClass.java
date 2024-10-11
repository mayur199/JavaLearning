package com.mayur.BasicBankingSystem;

public class MainClass {
	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.createAccount("A100","Mayur", 2000);
		bank.createAccount("Z101","John", 1000);

        bank.checkBalance("A100"); 
        bank.checkBalance("Z101"); 
        bank.checkBalance("Q999"); 
	}
}
