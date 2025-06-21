// File: DependencyInjectionExample.java

// Step 2: Repository Interface
interface CustomerRepository {
    String findCustomerById(String customerId);
}

// Step 3: Concrete Repository
class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String customerId) {
        // Simulating DB fetch
        return "Customer[ID=" + customerId + ", Name=Satwika, Location=Hyderabad]";
    }
}

// Step 4: Service Class
class CustomerService {
    private CustomerRepository customerRepository;

    // Step 5: Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerDetails(String id) {
        String customer = customerRepository.findCustomerById(id);
        System.out.println("Fetched from repository: " + customer);
    }
}
