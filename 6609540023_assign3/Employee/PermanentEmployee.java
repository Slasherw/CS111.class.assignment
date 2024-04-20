package 6609540023_assign3.Employee;

public class PermanentEmployee extends Employee{
    private double salary;
    private double socialSecurityRemittance;//กองทุนประกันสังคม
    private double monthlyPayment;

    protected PermanentEmployee(double salary){
        this.salary = salary;
        socialSecurityRemittance = Math.min(salary * 0.05 , 750);
    }

    protected double getMonthlyPayment(){
        monthlyPayment = salary - socialSecurityRemittance;
        if(performanceScore >= 8){
            monthlyPayment *= 1.03;
        }
        return monthlyPayment;
    }
    
    protected double getSalary() {
        return salary;
    }
    
    protected double getSocialSecurityRemittance(){
        return socialSecurityRemittance;
    }
}
