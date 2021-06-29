### 1. rename
* rename p to price
* rename o to order
* rename totSalesTx to totalSalesTax
* rename tot to total
### 2.Remove useless and commented code
### 3.Extract static variables
* '\t' -> TAB
* '\n' -> LINE_BREAK
* .10 -> TAX_RATE
* "======Printing Orders======\n" -> RECEIPT_HEADER
* "Sales Tax" -> salesTax
* "Total Amount" -> totalAmount
### 4.data_clumps
* Refine customerName and address into class Customer