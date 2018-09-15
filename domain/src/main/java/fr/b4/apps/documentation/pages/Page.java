package fr.b4.apps.documentation.pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sboudfor on 14/09/2018.
 * Parent class for all type of pages.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected LocalDateTime date;
    protected String authorPublicID;
    protected LocalDateTime lastUpdate;
    protected Integer grade;
    @Enumerated(value = EnumType.STRING)
    protected Status status;

    public boolean equals(Object object) {
        Page page = (Page) object;
        List<Boolean> equalConditions = new ArrayList<>();
        if (grade != null)
            equalConditions.add(grade.equals(page.grade));
        if (id != null)
            equalConditions.add(id.equals(page.id));
        if (authorPublicID != null)
            equalConditions.add(page.authorPublicID.equals(authorPublicID));
        equalConditions.add(page.date == date);
        equalConditions.add(page.lastUpdate == lastUpdate);
        equalConditions.add(page.date == date);
        return equalConditions.stream().filter(isValidField -> !isValidField).count() == 0;
    }
}
