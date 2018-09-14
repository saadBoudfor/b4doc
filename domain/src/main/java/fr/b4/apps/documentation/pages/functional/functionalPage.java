package fr.b4.apps.documentation.pages.functional;

import fr.b4.apps.documentation.pages.Page;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by sboudfor on 14/09/2018.
 * Entity for Function documentation pages.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class functionalPage extends Page {
    private String Description;
    @OneToOne
    private UserStory userStory;
    @OneToMany
    private List<Rule> ruleList;
    @OneToMany
    private List<Model> models;
    @OneToMany
    private List<Task> tasks;
}
