import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(10,converter.fahrenheitToCelsius(50));
        assertEquals(0,converter.fahrenheitToCelsius(32));
        assertEquals(-20, converter.fahrenheitToCelsius(-4));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(50, converter.celsiusToFahrenheit(10));
        assertEquals(32,converter.celsiusToFahrenheit(0));
        assertEquals(-4,converter.celsiusToFahrenheit(-20));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-100));
        assertTrue(converter.isExtremeTemperature(51));
        assertFalse(converter.isExtremeTemperature(-5));
        assertFalse(converter.isExtremeTemperature(25));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(-263.15, converter.kelvinToCelsius(10), 0.1);
        assertEquals(0, converter.kelvinToCelsius(273.15), 0.1);
    }
}