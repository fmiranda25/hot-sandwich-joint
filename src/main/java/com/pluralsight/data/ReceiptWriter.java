package com.pluralsight.data;

import com.pluralsight.model.Order;
import com.pluralsight.ui.UserInterface;

import java.io.*;

public class ReceiptWriter {

    public void CreateReceipt() throws IOException {
        String fileName = Order.getDateTime() + ".txt";
        File receipt = new File("receipts", fileName);
        FileWriter fileWriter = new FileWriter(receipt);
        fileWriter.write(String.valueOf(UserInterface.getOrderTotal()));

        fileWriter.close();
   }

}
