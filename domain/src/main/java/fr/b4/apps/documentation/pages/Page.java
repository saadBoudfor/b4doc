package fr.b4.apps.documentation.pages;

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
    protected Long Id;
    protected LocalDateTime Date;
    protected String authorPublicID;
    protected LocalDateTime LastUpdate;
    protected Integer grade;
    @Enumerated(value = EnumType.STRING)
    protected Status status;
}
