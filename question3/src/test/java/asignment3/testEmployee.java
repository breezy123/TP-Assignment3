package asignment3;

/**
 * Created by aubrey on 25/03/2017.
 */
import domain.Employee;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;
import Services.Implementation.HourlyEmployeeImp;

public class testEmployee extends TestCase {

    Employee employee = new Employee();
    HourlyEmployeeImp occupation = new HourlyEmployeeImp();

    public void testFirstName(){
        System.out.println(" The Name is "+ occupation.getEmployeeDescription().getFirstName());
        Assert.assertEquals(employee.getFirstName(),"Asanda");
    }
    public void testLastName(){
        System.out.println(" The Surname is "+ occupation.getEmployeeDescription().getLastName());
        Assert.assertEquals(employee.getLastName(),"Xaba");
    }
    public void testEmployeeNo(){
        System.out.println(" Employee Number is "+ occupation.getEmployeeDescription().getEmployeeNo());
        Assert.assertEquals(employee.getEmployeeNo(),"213222938");
    }
    public void testAge(){
        System.out.println(" Employee Age is "+ occupation.getEmployeeDescription().getAge());
        Assert.assertEquals(employee.getAge(),29);
    }


}
