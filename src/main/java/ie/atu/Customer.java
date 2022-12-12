package ie.atu;

public class Customer extends Person {
    private String customer_number;
    private Boolean mailing_list;

    public Customer() {
    }

    public Customer(String name, String address, String phone_number, String customer_number, Boolean mailing_list) {
        super(name, address, phone_number);
        this.customer_number = customer_number;
        this.mailing_list = mailing_list;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public Boolean getMailing_list() {
        return mailing_list;
    }

    public void setMailing_list(Boolean mailing_list) {
        this.mailing_list = mailing_list;
    }

}
