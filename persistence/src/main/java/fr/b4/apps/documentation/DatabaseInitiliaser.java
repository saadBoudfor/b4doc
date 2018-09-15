package fr.b4.apps.documentation;

import fr.b4.apps.documentation.pages.Project;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DatabaseInitiliaser implements CommandLineRunner {
    private ProjectRepository projectRepository;
    @Override
    public void run(String... strings) throws Exception {
        Project project = Project.builder()
                .title("B4 Assistant")
                .description("Portal to connect to different apps")
                .build();
        projectRepository.save(project);
    }
}
