package fr.b4.apps.documentation.pages.generic;

import fr.b4.apps.documentation.pages.Page;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sboudfor on 14/09/2018.
 * A white Page with generic contents.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class GenericPage extends Page {
    @OneToMany
    private List<Content> contents;

    @Override
    public boolean equals(Object page) {
        GenericPage genericPage = (GenericPage) page;
        List<Boolean> equalConditions = new ArrayList<>();
        equalConditions.add(genericPage.contents.equals(contents));
        equalConditions.add(super.equals(page));
        return equalConditions.stream().filter(isValidField -> !isValidField).count() == 0;
    }
}