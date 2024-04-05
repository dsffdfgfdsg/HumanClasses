public class Developer extends Human{
    public String language = "Java";

    Developer(boolean sex, double mass, double height, String name, String language) {
        super(sex, mass, height, name);
        this.language = language;
    }

    public void WriteCode() {
        System.out.println("Привет, Я " + super.name + " и я пишу код на " + language);
    }

    @Override
    public void doWork() {
        WriteCode();
    }

    @Override
    public int getHoursWorkAtDay() {
        return 16;
    }
}
