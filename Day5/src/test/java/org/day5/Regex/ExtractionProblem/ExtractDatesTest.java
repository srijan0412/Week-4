package org.day5.Regex.ExtractionProblem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.day5.Regex.ExtractionProblem.ExtractDates;
import java.util.List;

public class ExtractDatesTest {
    @Test
    public void testExtractingDatesFromValidData() {
        String sentence = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = ExtractDates.extractData("[0-9]{2}/[0-9]{2}/[0-9]{4}", sentence);
        assertEquals(3, dates.size());
        assertTrue(dates.contains("12/05/2023"));
        assertTrue(dates.contains("15/08/2024"));
        assertTrue(dates.contains("29/02/2020"));
    }

    @Test
    public void testExtractingDatesFromInvalidData() {
        String sentence = "This is a string with no valid dates in it. 12/2/11, 11/11/11111";
        List<String> dates = ExtractDates.extractData("[0-9]{2}/[0-9]{2}/[0-9]{4}", sentence);
        assertEquals(0, dates.size());
    }
}
