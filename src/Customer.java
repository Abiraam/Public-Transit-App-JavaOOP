// Author: Abiraam Nagarajan
// Filename: Customer.java
// Specification: Customer class specifications
// For: CS 2365 Object Oriented Programming Section 002


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    public static void writeToTxt(List<CustomerAbs> cust_orders_list){
        StringBuilder sb = new StringBuilder();
        Path fileName = Path.of("C:\\Users\\user\\IdeaProjects\\Public Transit Application\\customersorders.txt");

        for (int i = 0; i < cust_orders_list.size(); i++) {
            CustomerAbs abs = cust_orders_list.get(i);
            System.out.println("File written to " +fileName.toString());
            String new_sr = abs.getFirst_name() + " " + abs.getLast_name() + " " + abs.getCustomer_type() + " " + abs.getEmail_address() + " " + abs.getDiscount();
            sb.append(new_sr);
        }
        for (CustomerAbs abs : cust_orders_list){

        }
        try {
            Files.writeString(fileName, sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File b " + sb);




    }

    public static String[][] orders_list(){
        BufferedReader br_orders = null;
        String[][] orders_list = new String[0][];
        try {
            br_orders = new BufferedReader(new FileReader("orders.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //StringBuilder sb = new StringBuilder();
            List<String> array_orders = new ArrayList<String>();
            String line = null;
            if (br_orders != null) {
                line = br_orders.readLine();
            }

            while (line != null) {
                //sb.append(line);
                array_orders.add(line);
                //sb.append(System.lineSeparator());
                line = br_orders.readLine();

            }
            array_orders.remove(0);
            orders_list = new String[array_orders.size()][5];
            if (array_orders.size() > 0) {
                for (int i = 0; i < array_orders.size(); i++) {
                    String[] p1 = array_orders.get(i).split("\\s"); //splits the string line based on whitespace
                    for (int j = 0; j < p1.length; j++) {
                        orders_list[i][j] = p1[j];
                        //check(str_orders,);
                        //System.out.println(str_orders[i][j]);
                        //System.out.println(p1[j]);

                    }
                    //System.out.println();

                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br_orders != null) {
                    br_orders.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return orders_list;
    }

    public static String[][] customer_list(){
        BufferedReader br = null;
        String[][] customer_array = new String[0][];
        try {
            br = new BufferedReader(new FileReader("newcustomers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            StringBuilder sb = new StringBuilder();
            List<String> array = new ArrayList<String>();
            String line = null;
            if (br != null) {
                line = br.readLine();
            }

            while (line != null) {
                sb.append(line);
                array.add(line);
                //sb.append(System.lineSeparator());
                line = br.readLine();

            }
            array.remove(0);
            //System.out.println(array.size());
            int arraySize = array.size();
            //CustomerAbs bb = new CustomerAbs("first","","","","","") {};

            String everything = sb.toString();
            customer_array = new String[array.size() / 6][6];
            //System.out.println(bb.getEmail_address());

            int count = 0, max = 0, index=0;
            for (int i = 0; i < arraySize/6; i++) {
                //count++;
                max+=6;
                index=0;
                for (int j = count; j < max; j++) {
                    count++;
                    customer_array[i][index] = String.valueOf(array.get(j));
                    //System.out.println(customer_array[i][index]);
                    index++;
                    //System.out.println(String.valueOf(array.get(j)));
                    //array.remove(j);
                    //System.out.println(array.size() + " j = " +j + " \n");

                    //System.out.println(j);

                }
                System.out.println();
            }


            System.out.println();
            for (int i = 0; i < (arraySize / 6); i++) {
                for (int j = 0; j < 6; j++) {
                    //System.out.println(j);
                    //System.out.println(customer_array[i][j]);
                }
                //System.out.println();
            }
            //System.out.println(array.size()/6);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return customer_array;
    }


}
