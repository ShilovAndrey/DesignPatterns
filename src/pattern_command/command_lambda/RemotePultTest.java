package pattern_command.command_lambda;

public class RemotePultTest {

    public static void main(String[] args) {

        Light livingRoomLight = new Light("Living room light");
        GarageDoor garageDoor = new GarageDoor("Garage door");
        Bath bath = new Bath("bath");
        StereoSystem stereoSystem = new StereoSystem("stereo system");
        RemotePult pult = new RemotePult();
        pult.setPultCommands(0, livingRoomLight::on, livingRoomLight::off);
        pult.setPultCommands(1, garageDoor::up, garageDoor::down);
        pult.setPultCommands(2, bath::on, bath::off);

        Command lambdaStereo = () -> {
            stereoSystem.on();
            stereoSystem.playCD();
            stereoSystem.setVolume(10);
        };
        pult.setPultCommands(3, lambdaStereo, stereoSystem::off);

        pult.pushedOnButton(1);
        pult.pushedOffButton(1);
        pult.pushedOnButton(0);
        System.out.println(pult);
    }
}
