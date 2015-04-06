/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

/**
 *
 * @author Alex
 */
public class Customer {
    
    private String fName;
    private String lName;
    private String address; 
    private String city; 
    private String state;
    private String zip;  

    public Customer(String fName, String lName, String address, String city, String state, String zip) {
     setfName( fName);
     setlName(lName);
     setAddress( address);
     setCity(city);
     setState( state);
     setZip(zip);
    }

    public Customer() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    @Override
    public String toString(){
        String string="";
        
        return string;
                
    }
}
