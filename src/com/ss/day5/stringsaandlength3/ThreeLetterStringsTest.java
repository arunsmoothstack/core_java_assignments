package com.ss.day5.stringsaandlength3;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ThreeLetterStringsTest {

    @Test
    public void filterThreeLetterA() {
        assertTrue(ThreeLetterStrings.filterThreeLetterA().size() > 0);
    }
}
