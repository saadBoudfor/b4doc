package fr.b4.app.documentation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by sboudfor on 14/09/2018.
 *
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
class UserRoles {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Roles role;
}
