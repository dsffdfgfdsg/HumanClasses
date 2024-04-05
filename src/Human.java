public abstract class Human {
    public boolean sex = false;
    public double mass = 0.0;
    public double height = 0.0;
    public String name = "";

    Human(boolean sex, double mass, double height, String name) {
        this.sex = sex;
        this.mass = mass;
        this.height = height;
        this.name = name;
    }

    public void eat() {
        System.out.println("I eat.");

    }

    public void sleep() {
        System.out.println("I sleep.");

    }

    public abstract void doWork();
    public abstract int getHoursWorkAtDay();
}
