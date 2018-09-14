package fr.b4.apps.documentation.pages.functional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * Created by sboudfor on 14/09/2018.
 * User Story defined in the current functional Page.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserStory {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

}
