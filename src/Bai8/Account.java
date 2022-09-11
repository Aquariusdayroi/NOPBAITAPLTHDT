package Bai8;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
		private long  accountNumber ;
		private String name ;
		private double balance;
		private final double RATE = 0.035;
		
		public Account() {
			this.accountNumber = 999999;
			this.name = "chua xac dinh";
			this.balance = 50000;
		}
		
		public Account(long accountNumber, String name, double balance) {
			if(accountNumber>0)
				this.accountNumber = accountNumber;
			else
				this.accountNumber = 999999;
			if(name.equals(null))
				this.name = "chua xac dinh";
			else
				this.name = name;
			if(balance<50000)
				this.balance = 50000;
			else
				this.balance = balance;
			
		}
		public Account(long accountNumber, String name) {
			if(accountNumber>0)
				this.accountNumber = accountNumber;
			else
				this.accountNumber = 999999;
			if(name.equals(null))
				this.name = "chua xac dinh";
			else
				this.name = name;
			balance = 50000;
		}

		
//		dữ liệu gán là hợp lệ khi số tài khoản>0, tên tài khoản khác rỗng, số dư >=50000)
		
		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(long accountNumber) {
				this.accountNumber = accountNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
				this.balance = balance;
		}
		
		public boolean deposit(double amount) {
			if(amount>0) {
				balance += amount;
				return true;
			}
			else
				return false;
		}
		
		public boolean withdraw(double amount, double fee) {
			if(amount>0 && amount +fee <= balance) {
				balance -= amount+fee; 
				return true;
			}
			else
				return false;
		}
		public void addInterest() {
			balance =  balance+ balance*RATE;
		}
		public boolean transfer(Account acc2, double amount) {
			if(acc2.getBalance()>= amount && amount >0) {
					acc2.setBalance(acc2.getBalance()-amount);
					balance += amount;
					return true;
			}
			else
				return false;
			
		}
		public String toString() {
			Locale local = new Locale("vi", "vn");
			NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
			String s = String.format("%d%30s%30s",accountNumber,name, formatter.format(balance));
			return s;
		}
		
}