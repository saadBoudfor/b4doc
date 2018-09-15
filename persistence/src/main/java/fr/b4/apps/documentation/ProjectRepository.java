package fr.b4.apps.documentation;

import fr.b4.apps.documentation.pages.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sboudfor on 15/09/2018.
 */
public interface ProjectRepository extends JpaRepository<Project, Long>{
}
