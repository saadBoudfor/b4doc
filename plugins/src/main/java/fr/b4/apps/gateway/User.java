package fr.b4.apps.gateway;

import lombok.Builder;
import lombok.Data;

/**
 * Created by sboudfor on 14/09/2018.
 * Define User stored in B4authentication database.
 */
@Builder
@Data
public class User {
    private String publicID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
