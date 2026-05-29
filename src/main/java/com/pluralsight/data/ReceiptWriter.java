package com.pluralsight.data;

import com.pluralsight.model.Order;
import com.pluralsight.ui.UserInterface;

import java.io.*;

public class ReceiptWriter {

    public void CreateReceipt(Order order) throws IOException {
        File filePath = new File("receipts");
        String fileName = Order.getDateTime() + ".txt";
        FileWriter fileWriter = new FileWriter(fileName);
        File file = new File(filePath, fileName);
        fileWriter.write(order.toString());

        fileWriter.close();
   }

}
