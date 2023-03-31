package p203;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void getGrowthSal() {
    }

    public static void main(String[] args) {
        Employee employee = new Employee("MJ",3500,0.1);
        System.out.printf("salary: %.2f",employee.getGrowthSal(12));
    }
}