package fr.b4.app.documentation;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class db implements CommandLineRunner {
    private UserRolesRepository rolesRepository;
    @Override
    public void run(String... strings) throws Exception {
        UserRoles userRoles = UserRoles.builder().role(Roles.ADMIN).build();
        UserRoles created  = rolesRepository.save(userRoles);
    }
}
