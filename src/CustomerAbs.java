// Author: Abiraam Nagarajan
// Filename: CustomerAbs.java

import java.util.List;
import java.util.Objects;

public abstract class CustomerAbs {

    private String first_name;
    private String last_name;
    private String customer_type;
    private String email_address;
    private String discount;
    private String phone_number;

    public CustomerAbs(String first_name, String last_name, String customer_type, String email_address, String diiscount, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.customer_type = customer_type;
        this.email_address = email_address;
        this.discount = diiscount;
        this.phone_number = phone_number;
    }

    public CustomerAbs() {

    }

    //abstract void calc();

    //abstract List l();



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "CustomerAbs{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", customer_type='" + customer_type + '\'' +
                ", email_address='" + email_address + '\'' +
                ", discount='" + discount + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerAbs)) return false;
        CustomerAbs that = (CustomerAbs) o;
        return Objects.equals(first_name, that.first_name) && Objects.equals(last_name, that.last_name) && Objects.equals(customer_type, that.customer_type) && Objects.equals(email_address, that.email_address) && Objects.equals(discount, that.discount) && Objects.equals(phone_number, that.phone_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, customer_type, email_address, discount, phone_number);
    }
}
