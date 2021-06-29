package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;
    final char TAB = '\t';
    final char LINE_BREAK = '\n';
    final double TAX_RATE = .10;
    final String RECEIPT_HEADER = "======Printing Orders======\n";
    final String salesTax = "Sales Tax";
    final String totalAmount = "Total Amount";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        output.append(RECEIPT_HEADER);
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
        double totalSalesTax = 0d;
        double total = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(TAB);
            output.append(lineItem.getPrice());
            output.append(TAB);
            output.append(lineItem.getQuantity());
            output.append(TAB);
            output.append(lineItem.totalAmount());
            output.append(LINE_BREAK);
            double salesTax = lineItem.totalAmount() * TAX_RATE;
            totalSalesTax += salesTax;
            total += lineItem.totalAmount() + salesTax;
        }

        output.append(salesTax).append(TAB).append(totalSalesTax);
        output.append(totalAmount).append(TAB).append(total);
        return output.toString();
    }
}