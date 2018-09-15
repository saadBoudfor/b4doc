package fr.b4.documentation.pages.generic;

import fr.b4.apps.documentation.pages.generic.GenericPage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * Created by sboudfor on 15/09/2018.
 * Test GenericPage Entity.
 */
@SpringBootTest
public class GenericPageTest {

    @Test
    public void shouldCompareTwoPagesSuccess() {
        GenericPage pageOne = GenericPage.builder()
                .contents(new ArrayList<>())
                .build();
        GenericPage pageTwo = GenericPage.builder()
                .contents(new ArrayList<>())
                .build();
        Assert.assertTrue(pageOne.equals(pageTwo));
    }

    @Test
    public void shouldEqualsReturnTrueIfIsTheSameObject() {
        GenericPage pageOne = GenericPage.builder()
                .contents(new ArrayList<>())
                .build();
        Assert.assertTrue(pageOne.equals(pageOne));
    }
}
