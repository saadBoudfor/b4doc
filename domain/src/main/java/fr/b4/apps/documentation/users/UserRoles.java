package fr.b4.apps.documentation.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by sboudfor on 14/09/2018.
 * Mapper between Gateway's Users and B4Doc projects.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    private String userPublicID;
}
