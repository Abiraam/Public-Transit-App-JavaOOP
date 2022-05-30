// Author: Abiraam Nagarajan
// Filename: StudentCustomer.java
// Specification: Student Customer extending the CustomerAbs Class
// For: CS 2365 Object Oriented Programming Section 002

import java.util.List;

public class StudentCustomer extends CustomerAbs {
    public StudentCustomer() {
    }

  // void calc()

    public StudentCustomer(String first_name, String last_name, String customer_type, String email_address, String discount, String phone_number) {
        super(first_name, last_name, customer_type, email_address, discount, phone_number);
    }



}
