package pattern_command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}

class GaraGeDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GaraGeDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}

class GaraGeDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GaraGeDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}

class BathOnCommand implements Command {
    Bath bath;

    public BathOnCommand(Bath bath) {
        this.bath = bath;
    }

    public void execute() {
        bath.on();
    }

    public void undo() {
        bath.off();
    }
}

class BathOffCommand implements Command {
    Bath bath;

    public BathOffCommand(Bath bath) {
        this.bath = bath;
    }

    public void execute() {
        bath.off();
    }

    public void undo() {
        bath.on();
    }
}

class StereoSystemWithCDOnCommand implements Command {
    StereoSystem stereoSystem;

    public StereoSystemWithCDOnCommand(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    public void execute() {
        stereoSystem.on();
        stereoSystem.playCD();
        stereoSystem.setVolume(10);
    }

    public void undo() {
        stereoSystem.off();
    }
}

class StereoSystemWithCDOffCommand implements Command {
    StereoSystem stereoSystem;

    public StereoSystemWithCDOffCommand(StereoSystem stereoSystem) {
        this.stereoSystem = stereoSystem;
    }

    public void execute() {
        stereoSystem.off();
    }

    public void undo() {
        stereoSystem.on();
        stereoSystem.playCD();
        stereoSystem.setVolume(10);
    }
}

class FanOnHighCommand implements Command {
    Fan fan;
    int previousSpeed;

    public FanOnHighCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.high();
    }

    public void undo() {
        if (previousSpeed == fan.HIGH)
            fan.high();
        else if (previousSpeed == fan.MEDIUM)
            fan.medium();
        else if (previousSpeed == fan.LOW)
            fan.low();
        else if (previousSpeed == fan.OFF)
            fan.off();
    }
}

class FanOffHighCommand implements Command {
    Fan fan;
    int previousSpeed;

    public FanOffHighCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.off();
    }

    public void undo() {
        if (previousSpeed == fan.HIGH)
            fan.high();
        else if (previousSpeed == fan.MEDIUM)
            fan.medium();
        else if (previousSpeed == fan.LOW)
            fan.low();
        else if (previousSpeed == fan.OFF)
            fan.off();
    }
}