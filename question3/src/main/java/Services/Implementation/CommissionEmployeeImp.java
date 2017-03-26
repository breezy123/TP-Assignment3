package Services.Implementation;

/**
 * Created by aubrey on 26/03/2017.
 */
import Services.Implementation.EmployeeOccupation;
import domain.Employee;
public class CommissionEmployeeImp implements EmployeeOccupation {

    public Employee getEmployeeDescription(){

        Employee commEmployee = new Employee("Ayanda","Xulu","214111660",30);
        return commEmployee;
    }
}
