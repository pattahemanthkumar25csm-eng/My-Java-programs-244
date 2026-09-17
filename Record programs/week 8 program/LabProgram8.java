
    import java.util.Scanner;

// Interface are create dwith initialise variables
interface Payable {
    double BASIC_REGULAR = 25000;
    double HRA_REGULAR = 15000;
    double TA_REGULAR = 5000;

    double BASIC_CONTRACT = 12000;
    double TA_CONTRACT = 3000;

    void calculateSalary(); // to be implemented by each employee type
}

// Regular Employee implements the interface of one class
class RegularEmployee implements Payable {
    private String empid;

    RegularEmployee(String empid) {
        this.empid = empid;
    }

    @Override
    public void calculateSalary() {
        double total = BASIC_REGULAR + HRA_REGULAR + TA_REGULAR;
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + (int) BASIC_REGULAR +
                " HRA: " + (int) HRA_REGULAR +
                " T.A: " + (int) TA_REGULAR +
                " Total Amount: " + (int) total);
    }
}

// Contract Employee implements the interface
class ContractEmployee implements Payable {
    private String empid;

    ContractEmployee(String empid) {
        this.empid = empid;
    }

    @Override
    public void calculateSalary() {
        double total = BASIC_CONTRACT + TA_CONTRACT;
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + (int) BASIC_CONTRACT +
                " T.A: " + (int) TA_CONTRACT +
                " Total Amount: " + (int) total);
    }
}

public class LabProgram8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        String empid = sc.next();

        // Interface is used to omplentenation 
        Payable employee;

        if (empid.toUpperCase().startsWith("R")) {
            employee = new RegularEmployee(empid);
        } else if (empid.toUpperCase().startsWith("C")) {
            employee = new ContractEmployee(empid);
        } else {
            System.out.println("Invalid Employee Id.");
            sc.close();
            return;
        }

        employee.calculateSalary();
        sc.close();
    }
}

