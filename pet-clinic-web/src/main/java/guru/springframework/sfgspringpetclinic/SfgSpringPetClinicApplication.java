package guru.springframework.sfgspringpetclinic;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootApplication
public class SfgSpringPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgSpringPetClinicApplication.class, args);
    }

}
