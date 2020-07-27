package pattern_decorater;

public abstract class Beverage {
    public enum Size {LITTLE, MEDIUM, BIG}

    private Size size = Size.BIG;
    String description = "Описание не задано";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

