// Author: Abiraam Nagarajan
// Filename: ElderlyCustomer.java

public class ElderlyCustomer extends CustomerAbs {
    public ElderlyCustomer(String first_name, String last_name, String customer_type, String email_address, String discount, String phone_number) {
        super(first_name, last_name, customer_type, email_address, discount, phone_number);
    }



    @Override
    public String toString() {
        return "ElderlyCustomer{}";
    }
}
