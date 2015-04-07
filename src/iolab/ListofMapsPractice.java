/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.util.*;

/**
 *
 * @author Alex
 */
public class ListofMapsPractice {
    public static void main(String[] args) {
        
        List<Map<String,String>> datapoints = new ArrayList<>();
Map<String,String> data = new HashMap<>();
data.put("temp","72.5");
data.put("humidity",".30");
data.put("date","1/12/2015");
datapoints.add(data);

        System.out.println(datapoints);
    }
    
}
