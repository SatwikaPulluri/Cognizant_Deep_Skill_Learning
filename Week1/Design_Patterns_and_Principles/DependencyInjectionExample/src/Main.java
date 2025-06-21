// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Manually inject the dependency
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        // Use the service
        service.getCustomerDetails("C101");
    }
}
