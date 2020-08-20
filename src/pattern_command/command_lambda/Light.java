package pattern_command.command_lambda;

public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this + " свет загорелся");
    }

    public void off() {
        System.out.println(this + " свет погас");
    }

    public String toString() {
        return name;
    }
}

class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this + " открылась");
    }

    public void down() {
        System.out.println(this + " закрылась");
    }

    public String toString() {
        return name;
    }
}

class Bath {
    private String name;

    public Bath(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this + " вода подогревается");
    }

    public void off() {
        System.out.println(this + " вода остывает");
    }

    public String toString() {
        return name;
    }
}

class StereoSystem {
    public String name;

    public StereoSystem(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this + " start playing");
    }

    public void off() {
        System.out.println(this + " stop playing");
    }

    public void setVolume(int volume) {
        System.out.println(this + " playing with volume " + volume);
    }

    public void playCD() {
        System.out.println(this + " playing with CD");
    }

    public String toString() {
        return name;
    }
}

class Fan {
    private String location;
    private int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public Fan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }

}

