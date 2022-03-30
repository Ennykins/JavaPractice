package JavaExample;

public class BankAccount {

//    variable declaration

    public String customerName;
    public int customerAge;
    public String customerAddress;
    public double customerAccountBalance;


//    constructor (object instantiation)

    public BankAccount(String customerName,
                       int customerAge,
                       String customerAddress,
                       double customerAccountBalance) {

// values assigned from a global variable

        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerAddress = customerAddress;
        this.customerAccountBalance = customerAccountBalance;
    }

//    Method (mutator/setter)

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
// method (accessor)

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress (){
        return customerAddress;
    }

    public void setCustomerAge(int customerAge){
        this.customerAge = customerAge;
    }

    public int getCustomerAge(){
        return customerAge;
    }

    public void setCustomerAccountBalance(double customerAccountBalance) {
        this.customerAccountBalance = customerAccountBalance;
    }

    public double getCustomerAccountBalance(){
        return customerAccountBalance;
    }
}


