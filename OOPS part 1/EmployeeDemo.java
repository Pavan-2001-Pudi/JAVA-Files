/*16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.
Create a super class related to this subclass. */

public class EmployeeDemo {

    // Superclass: Employee
    public static class Employee {
        private String name;
        private int employeeId;

        // Constructor
        public Employee(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        // Method to display employee details
        public void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
        }
    }

    // Subclass: FactoryEmployee
    public static class FactoryEmployee extends Employee {
        private String busNo;
        private String empBoards;

        // Constructor
        public FactoryEmployee(String name, int employeeId, String busNo, String empBoards) {
            super(name, employeeId);
            this.busNo = busNo;
            this.empBoards = empBoards;
        }

        // Getters
        public String getBusNo() {
            return busNo;
        }

        public String getEmpBoards() {
            return empBoards;
        }

        // Overriding displayDetails to include factory employee specifics
        @Override
        public void displayDetails() {
            super.displayDetails(); // Call the superclass method
            System.out.println("Bus Number: " + busNo);
            System.out.println("Employee Boards: " + empBoards);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of FactoryEmployee
        FactoryEmployee factoryEmployee = new FactoryEmployee("John Doe", 12345, "Bus 12", "Board A");

        // Display employee details
        factoryEmployee.displayDetails();
    }
}
