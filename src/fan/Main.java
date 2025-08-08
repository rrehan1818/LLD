package fan;

public class Main {
    public static void main(String[] args) {
        Fanspeed2 f = Fanspeed2.OFF;

        System.out.println("Initial: " + f);

        System.out.println("Increase from OFF: " + f.increase());
        f = f.increase();

        f = f.decrease();
        System.out.println("Increase again: " + f.increase());
    }
}
