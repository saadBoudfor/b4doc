package fr.b4.apps.documentation.pages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sboudfor on 14/09/2018.
 * Software project to design and develop.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @OneToMany
    private List<Page> pages;
    @Column(length = 100)
    private String title;
    @Column(length = 1000)
    private String description;
}
