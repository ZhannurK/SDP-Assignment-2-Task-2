class LightThemeComponent implements ThemeComponent {
    private final String type;
    private boolean isChecked = false;

    public LightThemeComponent(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        if (type.equals("Button")) {
            System.out.println("Light Button");
        } else if (type.equals("Checkbox")) {
            System.out.println("Light Checkbox" + (isChecked ? " [Checked]" : " [Unchecked]"));
        }
    }

    @Override
    public void interact() {
        if (type.equals("Button")) {
            System.out.println("Light Button Clicked! Changing label to 'Clicked Light Button'");
        } else if (type.equals("Checkbox")) {
            isChecked = !isChecked;
            System.out.println("Light Checkbox Toggled! Now " + (isChecked ? "Checked" : "Unchecked"));
        }
    }
}