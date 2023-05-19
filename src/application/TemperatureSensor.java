package application;
import java.util.Random;
public class TemperatureSensor implements Sensor {
    private boolean on;

    public TemperatureSensor() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is not on.");
        }
        Random random = new Random();
        return random.nextInt(61) - 30;

    }
}
