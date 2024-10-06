class LightThemeFactory implements ThemeFactory {
    @Override
    public ThemeComponent createComponent(String type) {
        return new LightThemeComponent(type);
    }
}