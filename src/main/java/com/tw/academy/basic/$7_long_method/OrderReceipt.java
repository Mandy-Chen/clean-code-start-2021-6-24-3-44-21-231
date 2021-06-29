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
    final String RECEIPT_HEADER = "======Printing Orders======\n";
    final String salesTax = "Sales Tax";
    final String totalAmount = "Total Amount";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptContext = new StringBuilder();
        receiptContext.append(RECEIPT_HEADER);
        receiptContext.append(order.getCustomerName());
        receiptContext.append(order.getCustomerAddress());
        double totalSalesTax = 0d;
        double total = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            receiptContext.append(lineItem.generateReceiptContext());
            totalSalesTax += lineItem.getSalesTax();
            total += lineItem.getTotalCost();
        }

        receiptContext.append(salesTax).append(TAB).append(totalSalesTax);
        receiptContext.append(totalAmount).append(TAB).append(total);
        return receiptContext.toString();
    }

}