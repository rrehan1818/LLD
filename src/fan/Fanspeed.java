package fan;

public enum Fanspeed {
    LOW,
    MEDIUM,
    HIGH;

    public Fanspeed increase() {
        System.out.println("Increased");
        switch (this) {
            case LOW:
                System.out.println("Fan speed is now MEDIUM");
                return MEDIUM;
            case MEDIUM:
                System.out.println("Fan speed is now HIGH");
                return HIGH;
            case HIGH:
                System.out.println("Fan speed is already at highest speed");
                return this;
        }
        return this; // fallback (unreachable)
    }

    public Fanspeed decrease() {
        System.out.println("Decreased");
        switch (this) {
            case HIGH:
                System.out.println("Fan speed is now MEDIUM");
                return MEDIUM;
            case MEDIUM:
                System.out.println("Fan speed is now LOW");
                return LOW;
            case LOW:
                System.out.println("Fan is already at lowest speed");
                return this;
        }
        return this; // fallback (unreachable)
    }
}
