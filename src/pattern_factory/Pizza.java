package pattern_factory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Выпекаем 25 минут при температуре 350 градусов");
    }

    void cut() {
        System.out.println("Нарезаем пиццу по-диагонали");
    }

    void box() {
        System.out.println("Упаковываем пиццу в брендованные коробки");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clam=" + clam +
                '}';
    }
}
