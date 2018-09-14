package fr.b4.apps.documentation.pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sboudfor on 14/09/2018.
 * Software project to design and develop.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @OneToMany
    private List<Page> pages;
}
