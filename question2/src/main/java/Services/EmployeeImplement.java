package Services;

import domain.Employee;
/**
 * Created by aubrey on 25/03/2017.
 */
public class EmployeeImplement implements EmployeeOccupation{
    public Employee getEmployeeDescription(){
        Employee myemployee = new Employee("Aubrey","Fredericks","214111628",27);
        return myemployee;
    }
}
