class DarkThemeFactory implements ThemeFactory {
    @Override
    public ThemeComponent createComponent(String type) {
        return new DarkThemeComponent(type);
    }
}