public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        Employee e1 = new Employee(101, "Alice", "Developer", 75000);
        Employee e2 = new Employee(102, "Bob", "Manager", 90000);
        Employee e3 = new Employee(103, "Charlie", "Analyst", 65000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.displayAllEmployees();

        System.out.println("\nSearching for employee ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDeleting employee ID 101:");
        manager.deleteEmployee(101);

        manager.displayAllEmployees();
    }
}
