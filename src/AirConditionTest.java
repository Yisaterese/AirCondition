import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void airConditionisOn_airConditionOnTest() {
        AirCondition aC = new AirCondition();
        assertTrue(aC.isOn());
        aC.isOn();
        assertTrue(aC.isOn());

    }
        @Test
        public void airConditionIsOff_airConditionIsOffTest() {
        AirCondition aC = new AirCondition();
        assertTrue(aC.isOn());
        aC.isOff();
        assertFalse(aC.isOff());
    }
    @Test
    public void airConditionTemperatureIncrease_airConditionTemperatureIncreaseTest() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOff());
        aC.isOn();
        assertTrue(aC.isOn());
        aC.increaseTemperature();
        assertTrue(aC.increaseTemperature());
    }
    @Test
    public void airConditionTemperatureDecrease_airConditionTemperatureDecreaseTest(){
        AirCondition aC = new AirCondition();
        assertFalse(aC.decreaseTemperature());
    }
    @Test
    public void airConditionTemperature30_airConditionTemperatureIs30(){
        AirCondition aC = new AirCondition();
        assertFalse(aC.decreaseTemperature());
        aC.increaseTemperatureBeyondRange(15);
        assertEquals(15,aC.increaseTemperatureBeyondRange());
    }
}