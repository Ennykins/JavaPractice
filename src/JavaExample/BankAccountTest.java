package JavaExample;

public class BankAccountTest {
    public static void main(String[] args) {

//    Object creation/instantiation
        BankAccount bankAccount = new BankAccount("Eniola",
                39,
                "Alagomeji",
                2000 );

        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getCustomerAge());
        System.out.printf("%s", bankAccount.getCustomerAddress());
        System.out.printf("%.2f", bankAccount.getCustomerAccountBalance());


        bankAccount.setCustomerName("Anita");
        System.out.println(bankAccount.getCustomerName());

        bankAccount.setCustomerAccountBalance(67);
        System.out.println(bankAccount.getCustomerAge());

        bankAccount.setCustomerAddress("Maryland");
        System.out.println(bankAccount.getCustomerAddress());

        bankAccount.setCustomerAccountBalance(8000);
        System.out.println(bankAccount.getCustomerAccountBalance());



    }




}
