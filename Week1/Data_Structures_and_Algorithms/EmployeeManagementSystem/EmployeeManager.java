public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (size >= employees.length) {
            System.out.println("Cannot add more employees. Array is full.");
            return;
        }
        employees[size++] = emp;
        System.out.println("Employee added: " + emp);
    }

    // Search by ID
    public Employee searchEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == empId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all employees
    public void displayAllEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("Employee Records:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public void deleteEmployee(int empId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == empId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        // Shift left
        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null;
        size--;
        System.out.println("Employee with ID " + empId + " deleted.");
    }
}
