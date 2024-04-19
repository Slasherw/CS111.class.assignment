package 6609540023_assign3.Employee;

public class HourlyEmployee extends Employee {
    
    private int workingSessionPerMonth;
    private final int MIN_HOURLY_WAGE_RATE;
    private int workHour;
    private double calculatePersonalHourlyWage;
    private double monthlyPayment;

    protected HourlyEmployee(){
        workHour = 8;
        MIN_HOURLY_WAGE_RATE = 50*workHour;
    }

    protected void setWorkHour(int workHour){
        workHour = this.workHour;
    }

    protected void setWorkingSessionPerMonth(int workingSessionPerMonth){
        workingSessionPerMonth = this.workingSessionPerMonth;
    }

    protected void setCalculatePersonalHourlyWage(){
        if(performanceScore >= 0 && performanceScore <= 5){
            calculatePersonalHourlyWage = MIN_HOURLY_WAGE_RATE;
        }
        
        if(performanceScore > 5){
            if(performanceScore == 6){calculatePersonalHourlyWage = MIN_HOURLY_WAGE_RATE * 1.1;}
            if(performanceScore == 7){calculatePersonalHourlyWage = MIN_HOURLY_WAGE_RATE * 1.2;}
            if(performanceScore == 8){calculatePersonalHourlyWage = MIN_HOURLY_WAGE_RATE * 1.3;}
            if(performanceScore == 9){calculatePersonalHourlyWage = MIN_HOURLY_WAGE_RATE * 1.4;}
            if(performanceScore == 10){calculatePersonalHourlyWage = MIN_HOURLY_WAGE_RATE * 1.5;}
        }
    }

    protected double getMonthlyPayment(){
        monthlyPayment = 
    }




}
