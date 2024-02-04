public class AirCondition {
    private boolean isOn = false;
    private int temperature = 16;

    public boolean isOn() {
        return isOn;
    }
    public void isOff() {
        isOn = false;
    }

    public boolean toggleSwitch() {
        isOn = !isOn;
        return isOn;
    }

    public void increaseTemperature(int number) {
        for (int increase = 1; increase <= number; increase++) {
            temperature++;
            //return temperature;
        }

    }

    public int getIncreaseTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int number) {
        for (int decrease = number; decrease >= 1; decrease--) {
            this.temperature--;
        }
    }
    public int getDecrasetemperature() {
        return temperature;
    }

    public void sametTemperatureRange(int number) {
        for (int increase = 1; increase <= number; increase++) {
            boolean temperatureIsLessThanOrGreaterthan30 = temperature < 30;
            if (temperatureIsLessThanOrGreaterthan30) {
                temperature++;
            } else {

            }
        }
    }
    public int getSameTemperatureRange() {
        return temperature;

    }
    public void setSametTemperatureRange(int decrement) {
        for (int decrease = decrement; decrease >= 1; decrease--) {
            boolean temperatureIsLessThanOrGreaterthan30 = decrement < temperature;
            if (temperatureIsLessThanOrGreaterthan30) {
                temperature--;
            } else {

            }
        }
    }

    public int getReturnSameTemperatureRange() {
        return temperature;

    }



}
