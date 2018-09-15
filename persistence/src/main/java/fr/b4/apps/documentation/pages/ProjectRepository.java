package fr.b4.apps.documentation.pages;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sboudfor on 15/09/2018.
 * Query for project entity.
 */
public interface ProjectRepository extends JpaRepository<Project, Long>{
}
