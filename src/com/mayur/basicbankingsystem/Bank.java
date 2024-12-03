package com.mayur.basicbankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Account> accounts = new ArrayList<>();

	public void createAccount(String accountNumber, String accountHolder, double initialBalance) {

		Account newAccount = new Account();
		newAccount.setAccountNumber(accountNumber);
		newAccount.setAccountHolder(accountHolder);
		newAccount.setBalance(initialBalance);

		accounts.add(newAccount);
		System.out.println(newAccount.getAccountNumber());

	}

	public void checkBalance(String accountNumber) {
		for (Account account : accounts) {
	
			if (account.getAccountNumber().equals(accountNumber)) {
				System.out.println(account.getBalance());
				return;
			}

		}
		System.out.println("Account not found");
	}

}
