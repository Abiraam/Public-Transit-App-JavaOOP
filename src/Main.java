// Author: Abiraam Nagarajan
// Filename: Main.java
// Specification: Main function to check customer names & orders
// For: CS 2365 Object Oriented Programming Section 002

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //private static ArrayList cust_orders_list;
    private static List<CustomerAbs> cust_orders_list;
    public static String disc;
    public static void main(String[] args) {
        ///////check if custtomer name in orders
        String[][] orders_list = Customer.orders_list();
        String[][] customer_list = Customer.customer_list();
        if (customer_list.length > 0) {
            for (int i = 0; i < customer_list.length; i++) {
                for (int j = 0; j < orders_list.length; j++) {
                    String s = customer_list[i][1];
                    String s1 = customer_list[i][2];
                    String[] customer_arr = customer_list[i];
                    String[] orders_arr = orders_list[j];
                    //check(orders_list[j][],"s");
                    check(orders_arr,customer_arr);
                }
            }

            Customer.writeToTxt(cust_orders_list);
        }

    }

    private static void check(String[] orders_arr, String[] customer_arr) {
       cust_orders_list = new ArrayList();
       String last_name = customer_arr[1];
       String type = customer_arr[2];

       String txt;
       double wk_total, wkn_total, total_wks;
        boolean inOrders = Arrays.asList(orders_arr).contains(last_name);

        if (inOrders){
            switch (type){
                case "Student":
                    wk_total = 2*Integer.parseInt(orders_arr[2]);
                    wkn_total = 1.2*Integer.parseInt(orders_arr[3]);
                    total_wks = Integer.parseInt(orders_arr[4]);
                    disc = (total_wks<4)?"PAYG card at $" +wk_total+wkn_total +"/week":"Monthly pass at $" + total_wks + "/moth";
                    //disc = txt + String.valueOf((wk_total+wkn_total)*total_wks);


                case "Regular":
                    wk_total = 2*Integer.parseInt(orders_arr[2]);
                    wkn_total = 1.2*Integer.parseInt(orders_arr[3]);
                    total_wks = Integer.parseInt(orders_arr[4]);
                    disc = (total_wks<4)?"PAYG card at $" +wk_total+wkn_total +"/week":"Monthly pass at $" + total_wks + "/moth";

                case "Military":
                    wk_total = 2*Integer.parseInt(orders_arr[2]);
                    wkn_total = 1.2*Integer.parseInt(orders_arr[3]);
                    total_wks = Integer.parseInt(orders_arr[4]);
                    disc = (total_wks<4)?"PAYG card at $" +wk_total+wkn_total +"/week":"Monthly pass at $" + total_wks + "/moth";
                case "Senior":
                    wk_total = 2*Integer.parseInt(orders_arr[2]);
                    wkn_total = 1.2*Integer.parseInt(orders_arr[3]);
                    total_wks = Integer.parseInt(orders_arr[4]);
                    disc = (total_wks<4)?"PAYG card at $" +wk_total+wkn_total +"/week":"Monthly pass at $" + total_wks + "/month";

                    default:;
                disc = "*** NO ORDER ***";

            }

        }else {
            disc = "*** NO ORDER ***";
        }
        cust_orders_list.add(new CustomerAbs(customer_arr[0], customer_arr[1], type, customer_arr[4], disc, customer_arr[5]) {});


    }



}
