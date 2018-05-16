package sample.spring.chapter03.bankapp.domain;

import java.util.Date;

public class BankStatement {
	private Date transactionDate;
	private double amount;
	private String transactionType;
	private String referenceNumber;

	public Date getTransactionDate() {
		return transactionDate;
	}

	public BankStatement setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
		return this;
	}

	public double getAmount() {
		return amount;
	}

	public BankStatement setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public BankStatement setTransactionType(String transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public BankStatement setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	public String toString() {
		return " \nYour mini statement: Amount = " + this.getAmount()
				+ " \n Ref. number = " + this.getReferenceNumber()
				+ " \n Transaction Type = " + this.getTransactionType()
				+ " \n Transaction Date = " + this.getTransactionDate();
	}
}
