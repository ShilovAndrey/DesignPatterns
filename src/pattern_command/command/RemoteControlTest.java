package pattern_command.command;

public class RemoteControlTest {

    public static void main(String[] args) {

        // создаем объекты устройств

        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living room");
        Light kitchenRoomLight = new Light("Kitchen room");
        Bath bath = new Bath("Моя ванна");
        Fan livingRoomFan = new Fan("Living room");
        GarageDoor garageDoor = new GarageDoor("My garage door");
        StereoSystem stereoSystem = new StereoSystem("My stereo system");

        // создаем объекты команд

        LightOnCommand livingLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kithLightOnCommand = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kithLightOffCommand = new LightOffCommand(kitchenRoomLight);

        BathOnCommand bathOnCommand = new BathOnCommand(bath);
        BathOffCommand bathOffCommand = new BathOffCommand(bath);

        FanOnHighCommand fanOnHighCommand = new FanOnHighCommand(livingRoomFan);
        FanOffHighCommand fanOffHighCommand = new FanOffHighCommand(livingRoomFan);

        GaraGeDoorUpCommand garaGeDoorUpCommand = new GaraGeDoorUpCommand(garageDoor);
        GaraGeDoorDownCommand garaGeDoorDownCommand = new GaraGeDoorDownCommand(garageDoor);

        StereoSystemWithCDOnCommand stereoSystemWithCDOnCommand = new StereoSystemWithCDOnCommand(stereoSystem);
        StereoSystemWithCDOffCommand stereoSystemWithCDOffCommand = new StereoSystemWithCDOffCommand(stereoSystem);

        remoteControl.setUnits(0, livingLightOnCommand, livingLightOffCommand);
        remoteControl.setUnits(1, kithLightOnCommand, kithLightOffCommand);
        remoteControl.setUnits(2, bathOnCommand, bathOffCommand);
        remoteControl.setUnits(3, fanOnHighCommand, fanOffHighCommand);
        remoteControl.setUnits(4, garaGeDoorUpCommand, garaGeDoorDownCommand);
        remoteControl.setUnits(5, stereoSystemWithCDOnCommand, stereoSystemWithCDOffCommand);

        Command[] commandsOn = {livingLightOnCommand, kithLightOnCommand, bathOnCommand, fanOnHighCommand, garaGeDoorUpCommand,
                stereoSystemWithCDOnCommand};
        Command[] commandsOff = {livingLightOffCommand, kithLightOffCommand, bathOffCommand, fanOffHighCommand, garaGeDoorDownCommand,
                stereoSystemWithCDOffCommand};
        MasterCommand masterOnCommand = new MasterCommand(commandsOn);
        MasterCommand masterOffCommand = new MasterCommand(commandsOff);
        remoteControl.setUnits(6, masterOnCommand, masterOffCommand);

        System.out.println(remoteControl);

        remoteControl.pushTheOnButton(0);
        remoteControl.pushTheOnButton(1);
        remoteControl.pushTheOffButton(0);
        remoteControl.pushTheOnButton(5);
        remoteControl.undoButtonPushed();
        remoteControl.pushTheOnButton(4);
        remoteControl.pushTheOnButton(2);
        remoteControl.pushTheOffButton(6);
    }
}
