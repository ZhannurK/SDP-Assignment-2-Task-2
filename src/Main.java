public class Main {
    private final ThemeComponent button;
    private final ThemeComponent checkbox;

    public Main(ThemeFactory factory) {
        button = factory.createComponent("Button");
        checkbox = factory.createComponent("Checkbox");
    }

    public void displayComponents() {
        button.display();
        checkbox.display();
    }

    public void interactWithComponents() {
        button.interact();
        checkbox.interact();
    }

    public static void main(String[] args) {
        System.out.println("Light Theme:");
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Main lightApp = new Main(lightThemeFactory);
        lightApp.displayComponents();
        lightApp.interactWithComponents();

        System.out.println("\nDark Theme:");
        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Main darkApp = new Main(darkThemeFactory);
        darkApp.displayComponents();
        darkApp.interactWithComponents();
    }
}