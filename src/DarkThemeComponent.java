class DarkThemeComponent implements ThemeComponent {
    private final String type;
    private boolean isChecked = false;

    public DarkThemeComponent(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        if (type.equals("Button")) {
            System.out.println("Dark Button");
        } else if (type.equals("Checkbox")) {
            System.out.println("Dark Checkbox" + (isChecked ? " [Checked]" : " [Unchecked]"));
        }
    }

    @Override
    public void interact() {
        if (type.equals("Button")) {
            System.out.println("Dark Button Clicked! Changing label to 'Clicked Dark Button'");
        } else if (type.equals("Checkbox")) {
            isChecked = !isChecked;
            System.out.println("Dark Checkbox Toggled! Now " + (isChecked ? "Checked" : "Unchecked"));
        }
    }
}