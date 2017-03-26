/**
 * Created by aubrey on 25/03/2017.
 */
import Services.EmployeeImplement;
import domain.Employee;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

public class testEmployee extends TestCase{
    EmployeeImplement occupation = new EmployeeImplement();

    public void testFirstName(){
        Employee fName = occupation.getEmployeeDescription();
        Assert.assertEquals(fName.getFirstName(),"Aubrey");
    }
    public void testLastName(){
        Employee lName = occupation.getEmployeeDescription();
        Assert.assertEquals(lName.getLastName(),"Fredericks");
    }
    public void testEmployeeNo(){
        Employee employeeNo = occupation.getEmployeeDescription();
        Assert.assertEquals(employeeNo.getEmployeeNo(),"214111628");
    }
    public void testAge(){
        Employee empAge = occupation.getEmployeeDescription();
        Assert.assertEquals(empAge.getAge(),27);
    }

    public void testOutput(){
        Employee empReport = occupation.getEmployeeDescription();
        System.out.printf("%s\t%s\t\t%s\t\t%s\n","First Name","Last Name","Employee No","Age");
        System.out.println("\n================================================================\n");
        System.out.println(occupation.getEmployeeDescription().toString());
    }
}
