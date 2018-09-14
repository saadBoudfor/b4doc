package fr.b4.app.documentation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sboudfor on 14/09/2018.
 * Link user with Doc roles.
 */
@Repository
interface UserRolesRepository extends JpaRepository<UserRoles, Long>{
}
