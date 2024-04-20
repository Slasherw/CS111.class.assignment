import java.util.ArrayList;

package 6609540023_assign3.Employee;

public class EmployeeInheritanceTest extends HourlyEmployee,PermanentEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(super.setFullName("Somchai-Hankla"),super.setAge(25),super.setDepartment("IT"),super.setPerformanceScore(8),setSalary(20000));
        employees.add(super.setFullName("Somsong-Bunthum"),super.setAge(22),super.setDepartment("IT"),super.setPerformanceScore(4),setSalary(12000));
        HourlyEmployee.setWorkHour(8);
        employees.add(super.setFullName("Manee-Dumkum"),super.setAge(21),super.setDepartment("Production"),setWorkingSessionPerMonth(25),super.setPerformanceScore(6));
        employees.add(super.setFullName("Piti-Rukthai"),super.setAge(25),super.setDepartment("Production"),setWorkingSessionPerMonth(30),super.setPerformanceScore(5));
        employees.add(super.setFullName("Veera-Rukdee"),super.setAge(30),super.setDepartment("Production"),setWorkingSessionPerMonth(20),super.setPerformanceScore(8));
        
    }
}
