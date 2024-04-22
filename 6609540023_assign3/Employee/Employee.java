package 6609540023_assign3.Employee;

public abstract class Employee {

    private String fullName;
    private int age;
    private String department;
    private int performanceScore;

    protected Employee(String fullName, int age, String department, int performanceScore){
        this.fullName=fullName;
        this.age=age;
        this.department=department;
        this.performanceScore=performanceScore;
    }

    protected String getFullName(){
        return fullName;
    }

    protected String getName(){
        return fullName.substring(0 , fullName.indexOf("-"));
    }
    
    protected String getLastName(){
        return fullName.substring(fullName.indexOf("-") + 1);
    }


    protected void setAge(int age){
        age = this.age;
    }

    protected int getAge(){
        return age;
    }

    protected void setDepartment(String department){
        department = this.department;
    }

    protected String getDepartment(){
        return department;
    }

    protected void setPerformanceScore(int pScore){
        performanceScore = pScore;
    }

    protected int getPerformanceScore(){
        return performanceScore;
    }

    abstract protected double getMonthlyPayment();

}
