package Config;

/**
 * Created by aubrey on 26/03/2017.
 */
import Services.Implementation.CommissionEmployeeImp;
import Services.Implementation.HourlyEmployeeImp;
import Services.Implementation.EmployeeOccupation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="Ayan")
    public EmployeeOccupation getEmployeeDescription(){
        return new CommissionEmployeeImp();
    }
    @Bean(name="Asa")
    public EmployeeOccupation getEmployeeDescription(){
        return new HourlyEmployeeImp();
    }
}
