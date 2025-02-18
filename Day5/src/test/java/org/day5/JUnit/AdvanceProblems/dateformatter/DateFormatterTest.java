package org.day5.JUnit.AdvanceProblems.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.JUnit.AdvanceProblem.dateformatter.DateFormatter;

public class DateFormatterTest {

    DateFormatter dateFormatter = new DateFormatter();

    @Test
    public void testValidDate() {
        String inputDate = "2025-02-15";
        String expected = "15-02-2025";
        assertEquals(expected, dateFormatter.formatDate(inputDate), "Date should be formatted correctly.");
    }

    @Test
    public void testEmptyDate() {
        String inputDate = "";
        assertNull(dateFormatter.formatDate(inputDate), "Empty date string should return null.");
    }

    @Test
    public void testNullDate() {
        assertNull(dateFormatter.formatDate(null), "Null input should return null.");
    }
}
