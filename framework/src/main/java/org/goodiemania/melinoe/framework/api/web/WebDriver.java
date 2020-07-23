package org.goodiemania.melinoe.framework.api.web;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.goodiemania.melinoe.framework.api.web.validators.WebValidator;

public interface WebDriver {
    Navigate navigate();

    String getTitle();

    void waitFor(Predicate<WebDriver> predicate);

    Optional<WebElement> findElement(By by);

    List<WebElement> findElements(By by);

    void checkPage(final List<WebValidator> validators);

    void verify(final List<WebValidator> validators);

    default void verify(final WebValidator... validators) {
        verify(Arrays.asList(validators));
    }
}
