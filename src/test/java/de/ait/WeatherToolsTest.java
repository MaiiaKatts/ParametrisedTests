package de.ait;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {
    @ParameterizedTest
    @CsvSource({
            "0, false, 'Calm with speed of 0 km'",
            "3, false, 'Light Air with speed of 3 km'",
            "9, false, 'Light Breeze with speed of 9 km'",
            "16, false, 'Gentle Breeze with speed of 16 km'",
            "23, false, 'Moderate Breeze with speed of 23 km'",
            "30, false, 'Fresh Breeze with speed of 30 km'",
            "50, false, 'Hurricane Force with speed of 50 km'",
            "4, true, 'Gusty Light Air with speed of 4 km'",
            "10, true, 'Gusty Light Breeze with speed of 10 km'",
            "18, true, 'Gusty Gentle Breeze with speed of 18 km'",
            "25, true, 'Gusty Moderate Breeze with speed of 25 km'",
            "34, true, 'Gusty Fresh Breeze with speed of 34 km'",
            "50, true,' Gusty Hurricane Force with speed of 50 km'"
    })
    public void getWindDescription_test_1(int speed, boolean isGusty, String expected) {
        assertEquals(//почему подчеркнуто ораньжевым штрихом???????
                expected,
                WeatherTools.getWindDescription(speed, isGusty));
    }
}