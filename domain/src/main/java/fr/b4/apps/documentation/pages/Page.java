package fr.b4.apps.documentation.pages;

import fr.b4.apps.documentation.pages.generic.GenericPage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by sboudfor on 14/09/2018.
 * Parent class for all type of pages.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Page {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected LocalDateTime date;
    protected String authorPublicID;
    protected LocalDateTime lastUpdate;
    protected Integer grade;
    @Enumerated(value = EnumType.STRING)
    protected Status status;

    @Override
    public boolean equals(Object page) {
        return super.equals(page);
    }
}
