package Services.Implementation;

/**
 * Created by aubrey on 26/03/2017.
 */
import Services.Implementation.EmployeeOccupation;
import domain.Employee;

public class HourlyEmployeeImp implements EmployeeOccupation{

    public Employee getEmployeeDescription(){

        Employee emp = new Employee("Asanda","Xaba","213222938",29);
        return emp;
    }
}
