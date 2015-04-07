/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author Alex
 */
public class iolab {

    private static final int ERROR = JFileChooser.ERROR_OPTION;
    private static final int APPROVE = JFileChooser.APPROVE_OPTION;
    private static final int CANCEL = JFileChooser.CANCEL_OPTION;

    public static void main(String[] args) throws Exception {

        // Build a file chooser component that displays files only
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        List<Customer> customers = new ArrayList<>();
        Customer customer = null;

        // check if user clicked Cancel button on dialog, if so, return
        int result = fileChooser.showOpenDialog(null);
        if (!(result == APPROVE)) {
            System.exit(0);
        }

		// Display all files available in FileChooser dialog
        // To filter for only ".txt" or other files you need to create a custom
        // filter class, and to learn more about JFileChooser,
        // see http://java.sun.com/j2se/1.4.2/docs/api/javax/swing/JFileChooser.html
        File file = fileChooser.getSelectedFile();

		// check if file exists, if we have read access rights and if the File object
        // is in fact a file (vs a Directory).
        // If so, loop through and read each line of text
        if (file.exists() && file.canRead() && file.isFile()) {
            BufferedReader in = new BufferedReader(
                    new FileReader(file));
            String line = in.readLine();
            while (line != null) {

                int counter = 0;
                try {

//            String line = in.readLine();
                    while (line != null && counter < 3) {

                        if (counter == 0) {
                            customer = new Customer();
                            counter++;
                            String[] a = line.split(" ");
                            customer.setfName(a[0]);
                            customer.setlName(a[1]);
                            line = in.readLine();

                        } else if (counter == 1) {
                            counter++;
                            customer.setAddress(line);
                            line = in.readLine();
                        } else if (counter == 2) {

                            String[] a = line.split(" ");
                            customer.setCity(a[0]);
                            customer.setState(a[1]);
                            customer.setZip(a[2]);
                            line = in.readLine();
                            counter = 0;
                            customers.add(customer);
                        }

                    }

                } catch (IOException ioe) {

                    throw ioe;

                } finally {
                    try {
                        in.close();
                    } catch (Exception e) {

                    }
                }

                for (Customer c : customers) {
                    System.out.println("FirstName: " + c.getfName() + " \n" + "LastName:" + c.getlName() + " \n"
                            + "Address:" + c.getAddress() + " \n" + "City:" + c.getCity() + " \n" + "State: " + c.getState() + " \n" + "Zip:" + c.getZip() + " \n");
                }

//			  System.out.println(line);
//			  line = in.readLine();  // strips out any carriage return chars
            }
            in.close();
            System.exit(0);
        } else {
            System.out.println("File not found: " + file.getCanonicalPath());
            System.exit(1);
        } // end if

//        File file = new File(File.separatorChar + "Temp" + File.separatorChar
//                + "lab1.txt");
//        try (
//                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
//
//            out.println("Alex Woodward \n 259 Lakeridge Dr. \nOconomowoc WI 53066");
//            out.println("Ryan Corbin \n 123 Sweet St. \nDelafield WI 53072");
//        } catch (IOException e) {
//    //exception handling left as an exercise for the reader
//        }
//        System.out.println(customer.getfName() + " \n" + customer.getAddress() + " \n" + customer.getCity() );
    }

}
