package FanDemo;

import fan.Fanspeed2; // Assuming you named your enum Fanspeed2

public class Fan2 {
    private boolean isOn = false;
    private Fanspeed2 speed;

    public Fan2() {
        this.speed = Fanspeed2.OFF;
    }

    public void switchOffTheFan() {
        isOn = false;
        speed = Fanspeed2.OFF;
    }

    public boolean status() {
        return isOn;
    }

    public void increase() {
        if (isOn) {
            speed = speed.increase();
        } else {
            System.out.println("Fan is OFF. Cannot increase speed.");
        }
    }

    public void decrease() {
        if (isOn) {
            speed = speed.decrease();
        } else {
            System.out.println("Fan is OFF. Cannot decrease speed.");
        }
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Fan turned ON.");
    }

    @Override
    public String toString() {
        return "Fan2{" +
                "isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}
