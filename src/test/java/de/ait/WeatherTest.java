package de.ait;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static de.ait.Weather.describeTemperature;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("describeTemperatureTests")
class ForWeatherTest {
    @ParameterizedTest
    @CsvSource({
            "-30, '-30ºC - it is cold.'",
            "0, '0ºC - it is cold.'",
            "5, '5ºC - it is fresh.'",
            "10, '10ºC - it is fresh.'",
            "15, '15ºC - it is warm.'",
            "20, '20ºC - it is warm.'",
            "25, '25ºC - it is hot.'",
            "30, '30ºC - it is hot.'"
    })
    public void describeTemperature_test_1(int temperature, String description) {
        assertEquals(//почему подчеркнуто ораньжевым штрихом???????
                describeTemperature(temperature), description
        );
    }
}
