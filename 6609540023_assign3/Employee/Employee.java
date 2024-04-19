package 6609540023_assign3.Employee;

public class Employee {

    protected String firstName;
    protected String lastName;
    protected String age;
    protected String department;
    protected int performanceScore;

    protected void setFullName(String fullName){
        String[] name = fullName.split("-");
        if(name.length == 2){
            firstName = name[0];
            lastName = name[1];
        }else {
            System.out.println("Invalid input format. Please use 'Firstname-Lastname'");
        }
    }

    protected String getFirstName(){
        return firstName;
    }

    protected String getLastName(){
        return lastName;
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
}
