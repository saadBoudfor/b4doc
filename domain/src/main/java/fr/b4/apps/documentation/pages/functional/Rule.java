package fr.b4.apps.documentation.pages.functional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by sboudfor on 14/09/2018.
 * Management rules.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rule {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
