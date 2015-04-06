/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.util.*;
import java.io.*;

/**
 *
 * @author Alex
 */
public class iolab {
    
    public static void main(String[] args) throws Exception {
    
    
   File file = new File(File.separatorChar + "Temp" + File.separatorChar 
                        + "lab1.txt");
               
      
     BufferedReader in = null;
        List<Customer> customers = new ArrayList<>();
     Customer customer = null;
     
     try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
    out.println("Alex Woodward \n 259 Lakeridge Dr. \nOconomowoc WI 53066");
}catch (IOException e) {
    //exception handling left as an exercise for the reader
}
     
     int counter = 0;
        try {
	   in = new BufferedReader(new FileReader(file));
	   String line = in.readLine();
          
          
	   while(line != null && counter < 3 ){
              
               if(counter == 0){
                   customer = new Customer();
                   counter++;
                   String[] a = line.split(" ");
                    customer.setfName(a[0]);
                    customer.setlName(a[1]);
		  line = in.readLine(); 
                
               }else
               if(counter ==1){
               counter++;
                    customer.setAddress(line);
		  line = in.readLine(); 
               }
               else if(counter ==2){
               
               String[] a = line.split(" ");
               customer.setCity(a[0]);
                    customer.setState(a[1]);
                customer.setZip(a[2]);
		  line = in.readLine(); 
                  counter =0;
                  customers.add(customer);
               }
               
   
	   }
	 
        } catch(IOException ioe) {
            
            throw ioe;

        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
    
    for (Customer c : customers) {
          System.out.println("FirstName: " + c.getfName() + " \n" + "LastName:" + c.getlName() + " \n"  +
                  "Address:" +  c.getAddress() + " \n" + "City:" + c.getCity() + " \n" + "State: " + c.getState() + " \n" + "Zip:" + c.getZip() + " \n");
        }
    
    
//        System.out.println(customer.getfName() + " \n" + customer.getAddress() + " \n" + customer.getCity() );
  
    }
    
}
