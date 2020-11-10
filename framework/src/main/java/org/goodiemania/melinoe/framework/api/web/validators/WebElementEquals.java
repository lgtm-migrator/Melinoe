package org.goodiemania.melinoe.framework.api.web.validators;

import org.apache.commons.lang3.StringUtils;
import org.goodiemania.melinoe.framework.api.ValidationResult;
import org.goodiemania.melinoe.framework.api.web.By;
import org.goodiemania.melinoe.framework.api.web.WebDriver;

public class WebElementEquals implements WebValidator {
    private final By elementFinder;
    private final String searchText;

    public WebElementEquals(final By elementFinder, final String searchText) {
        this.elementFinder = elementFinder;
        this.searchText = searchText;
    }

    @Override
    public ValidationResult validate(final WebDriver webDriver) {
        final String possibleElementText = webDriver.findElement(elementFinder).getText();

        if (possibleElementText.isEmpty()) {
            return ValidationResult.failed("Could not find element",
                    "element search by: " + elementFinder.getType() + ":" + elementFinder.getText());
        } else if (StringUtils.equals(possibleElementText, searchText)) {
            return ValidationResult.passed("Found expected text: " + searchText,
                    "element search by: " + elementFinder.getType() + ":" + elementFinder.getText());
        } else {
            return ValidationResult.failed("Could not find expected text: " + searchText,
                    "actual text: " + possibleElementText,
                    "element search by: " + elementFinder.getType() + ":" + elementFinder.getText());
        }
    }
}
