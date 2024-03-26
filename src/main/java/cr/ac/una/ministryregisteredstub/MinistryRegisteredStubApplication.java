package cr.ac.una.ministryregisteredstub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {
        "cr.ac.una.ministryregisteredstub.data.repository",
        "cr.ac.una.ministryregisteredstub.controller"})
public class MinistryRegisteredStubApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MinistryRegisteredStubApplication.class, args);
    }

}
