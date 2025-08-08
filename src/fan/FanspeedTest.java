package fan;

public class FanspeedTest {
    public static void main(String[] args) {
        Fanspeed fanspeed = Fanspeed.LOW;

        fanspeed = fanspeed.increase();
        fanspeed = fanspeed.increase();
        fanspeed = fanspeed.increase();

        fanspeed = fanspeed.decrease();
        fanspeed = fanspeed.decrease();
        fanspeed = fanspeed.decrease();
    }
}
