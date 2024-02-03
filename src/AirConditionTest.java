import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void airConditionIsOn_airConditionOnTest() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOn());
        assertTrue(aC.toggleSwitch());
        assertTrue(aC.isOn());
    }       @Test
        public void airConditionIsOff_airConditionIsOffTest() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOn());
        assertTrue(aC.toggleSwitch());
        assertTrue(aC.isOn());
        assertFalse(aC.toggleSwitch());
        //aC.isOff();
    }
       @Test
    public void airConditionTemperatureIncrease_airConditionTemperatureIncreaseTest() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOn());
        assertTrue(aC.toggleSwitch());
        assertTrue(aC.isOn());
        aC.increaseTemperature(5);
        assertEquals(21,aC.getIncreaseTemperature());

    }
    @Test
    public void airConditionTemperatureDecrease_airConditionTemperatureDecreaseTest() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOn());
        assertTrue(aC.toggleSwitch());
        assertTrue(aC.isOn());
        aC.increaseTemperature(5);
        assertEquals(21, aC.getIncreaseTemperature());
        aC.decreaseTemperature(10);
        assertEquals(11, aC.getDecrasetemperature());

    }
    @Test
    public void temperatureIncreasedTo30_temperatureincreaseTo30Test() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOn());
        assertTrue(aC.toggleSwitch());
        assertTrue(aC.isOn());
        aC.increaseTemperature(9);
        assertEquals(25, aC.getIncreaseTemperature());
        aC.sametTemperatureRange(40);
        System.out.println(aC.getSameTemperatureRange());
        assertEquals(30,aC.getSameTemperatureRange());

    }
    @Test
    public void temperatureDecreasedTo16_temperatureDecreaseTo16Test() {
        AirCondition aC = new AirCondition();
        assertFalse(aC.isOn());
        assertTrue(aC.toggleSwitch());
        assertTrue(aC.isOn());
        aC.increaseTemperature(14);
        assertEquals(30, aC.getIncreaseTemperature());
       aC.setSametTemperatureRange(-1);
       System.out.println(aC.getReturnSameTemperatureRange());
        assertEquals(30,aC.getReturnSameTemperatureRange());

    }


}