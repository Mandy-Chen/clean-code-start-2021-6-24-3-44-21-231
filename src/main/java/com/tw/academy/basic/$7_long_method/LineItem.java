package com.tw.academy.basic.$7_long_method;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	final char TAB = '\t';
	final char LINE_BREAK = '\n';

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

    double totalAmount() {
        return price * quantity;
    }

	public String generateReceiptContext() {

		return this.description + TAB
				+ this.price + TAB
				+ this.quantity + TAB
				+ this.totalAmount() + LINE_BREAK;
	}
	public double getSalesTax() {
		final double TAX_RATE = 0.10;
		return this.totalAmount() * TAX_RATE;
	}

	public double getTotalCost() {
		return this.totalAmount() + this.getSalesTax();
	}
}