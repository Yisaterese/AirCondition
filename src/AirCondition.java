public class AirCondition {
    private boolean isOn = false;
    private int temperature;

    public boolean isOn() {
        return isOn = true;
    }

    public boolean isOff() {
        boolean isOff = false;
        return false;
    }

    public boolean increaseTemperature() {
        temperature++;
        return true;
    }

    public boolean decreaseTemperature() {
        temperature--;
        return false;
    }

    public boolean ifIIncreaseTemperatureBeyondRangeItIsStillTheSame(int number) {
        boolean theRangeOfTemperature = temperature < 16 && temperature > 30;
        if(increaseTemperature() < theRangeOfTemperature){
        }else{

        }
        return true;
    }
}