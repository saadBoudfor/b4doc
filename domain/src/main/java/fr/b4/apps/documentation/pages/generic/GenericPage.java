package fr.b4.apps.documentation.pages.generic;

import fr.b4.apps.documentation.pages.Page;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sboudfor on 14/09/2018.
 * A white Page with generic contents.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GenericPage extends Page {
    @OneToMany
    private List<Content> contents;

    @Override
    public boolean equals(Object page) {
        return super.equals(page);
    }
}