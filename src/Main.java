import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        Designer designer = new Designer(false, 88.0, 175.0, "Ещё кто-то", "aquarel");
        Developer developer = new Developer(false, 89.0, 195.0, "Программист", "Java");

        designer.doWork();
        developer.doWork();

        System.out.println(designer.getHoursWorkAtDay());
        System.out.println(developer.getHoursWorkAtDay());
    }
}