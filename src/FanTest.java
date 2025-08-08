public class FanTest {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.brand = "Crompton";
        f.Model = "C7EF";
        f.Blades = "4";
        f.colour = "Brown";
        f.Mode = "Automatic";
        System.out.println(f.brand);
        System.out.println(f.Model);
        System.out.println(f.Blades);
        System.out.println(f.colour);
        System.out.println(f.Mode);
    }
}