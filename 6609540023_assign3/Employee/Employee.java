package 6609540023_assign3.Employee;

public abstract class Employee {

    protected String fullName;
    protected String age;
    protected String department;
    protected int performanceScore;

    protected Employee(){
        fullName = null;
        age = 0;
        department = null;
        performanceScore = 0;
    }

    protected void setFullName(String name){
        fullName = name;
    }

    protected String getFullName(){
        return fullName;
    }

    protected String getName(){
        String[] name = fullName.split("-");
        if(name.length == 2){
            return name[0];
        }else{
            return "Invalid input format.";
        }
    }
    
    protected String getLastName(){
        String name = fullName.split("-");
        if(name.length == 2){
            return name[1];
        }else{
            return "Invalid input format";
        }
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
