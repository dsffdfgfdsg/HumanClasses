public class Designer extends Human{
    public String favoriteStyle = "aquarel";

    Designer(boolean sex, double mass, double height, String name, String favoriteStyle) {
        super(sex, mass, height, name);
        this.favoriteStyle = favoriteStyle;
    }

    public void makeDesign() {
        System.out.println("Меня зовут " + super.name + " и я умею делать дизайн. Мой любимый стиль " + favoriteStyle);
    }

    @Override
    public void doWork() {
        makeDesign();
    }

    @Override
    public int getHoursWorkAtDay() {
        return 10;
    }
}
