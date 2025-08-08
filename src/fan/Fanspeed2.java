package fan;

public enum Fanspeed2 {
    OFF,
    LOW,
    MEDIUM,
    HIGH;

    public Fanspeed2 increase() {
        return switch (this) {
            case OFF -> LOW;
            case LOW -> MEDIUM;
            case MEDIUM -> HIGH;
            case HIGH -> HIGH; // Already at max speed
        };
    }

    public Fanspeed2 decrease() {
        return switch (this) {
            case OFF -> OFF; // Already off
            case LOW -> OFF;
            case MEDIUM -> LOW;
            case HIGH -> MEDIUM;
        };
    }
}
