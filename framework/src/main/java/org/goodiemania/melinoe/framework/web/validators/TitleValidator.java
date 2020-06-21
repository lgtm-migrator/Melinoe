package org.goodiemania.melinoe.framework.web.validators;

import org.apache.commons.lang3.StringUtils;
import org.goodiemania.melinoe.framework.Session;
import org.goodiemania.melinoe.framework.session.MetaSession;
import org.openqa.selenium.WebDriver;

/**
 * Created on 28/06/2019.
 */
public class TitleValidator implements WebValidator {
    private String expectedTitle;

    public TitleValidator(final String expectedTitle) {
        this.expectedTitle = expectedTitle;
    }

    @Override
    public ValidationResult validate(final Session context, final WebDriver webDriver) {
        String actualTitle = webDriver.getTitle();
        if (StringUtils.equals(actualTitle, expectedTitle)) {
            return ValidationResult.passed();
        } else {
            return ValidationResult.failed("Title is not as expected",
                    "Expected title: " + expectedTitle,
                    "Actual title: " + actualTitle);
        }
    }
}
