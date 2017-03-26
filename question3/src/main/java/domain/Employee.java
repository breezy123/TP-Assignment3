package domain;
//import Services.Implementation.EmployeeOccupation;
/**
 * Created by aubrey on 25/03/2017.
 */
public class Employee {
    private String empName;
    private String empSurname;
    private String empNumber;
    private int age;

    public Employee(){}

    public Employee(String empName, String empSurname, String empNumber,int age){
        setfirstName(empName);
        setlastName(empSurname);
        setEmployeeNo(empNumber);
        setAge(age);

    }
    public void setfirstName(String empName){
        this.empName = empName;
    }
    public void setlastName(String empSurname){
        this.empSurname = empSurname;
    }
    public void setEmployeeNo(String empNumber){
        this.empNumber = empNumber;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getFirstName(){
        return empName;
    }
    public String getLastName(){
        return empSurname;
    }
    public String getEmployeeNo(){
        return empNumber;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        String format = String.format("%s\t\t%s\t\t%s\t\t%d\n",getFirstName(),getLastName(),getEmployeeNo(),getAge());
        return format;
    }
}
