package fr.b4.documentation.pages.functional;

import fr.b4.apps.documentation.pages.functional.FunctionalPage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * Created by sboudfor on 15/09/2018.
 * Test Functional Entity.
 */

@SpringBootTest
public class FunctionalPageTest {
    @Test
    public void shouldCompareTwoPagesSuccess() {
        FunctionalPage pageOne = FunctionalPage.builder()
                .description("One")
                .build();
        FunctionalPage pageTwo = FunctionalPage.builder()
                .description("Two")
                .build();
        Assert.assertTrue(pageOne.equals(pageTwo));
    }

    @Test
    public void shouldEqualsReturnTrueIfIsTheSameObject() {
        FunctionalPage pageOne = FunctionalPage.builder()
                .description("One")
                .build();
        Assert.assertTrue(pageOne.equals(pageOne));
    }
}
