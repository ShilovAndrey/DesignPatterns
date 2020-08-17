package pattern_command;

public class RemoteControl {
    private Command[] commandOn;
    private Command[] commandOff;
    private Command undoCommand;

    public RemoteControl() {
        commandOn = new Command[7];
        commandOff = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            commandOn[i] = noCommand;
            commandOff[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setUnits(int number, Command commandOn, Command commandOff) {
        this.commandOn[number] = commandOn;
        this.commandOff[number] = commandOff;
    }

    public void pushTheOnButton(int number) {
        commandOn[number].execute();
        undoCommand = commandOn[number];
    }

    public void pushTheOffButton(int number) {
        commandOff[number].execute();
        undoCommand = commandOff[number];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder theString = new StringBuilder();
        theString.append("\n---------------------------Remote Control-----------------------\n");
        for (int i = 0; i < commandOn.length; i++) {
            theString.append("[slot " + i + "] " + commandOn[i].getClass().getName() + "       " + commandOff[i].getClass().getName() + "\n");
        }
        theString.append(undoCommand + "\n");
        return theString.toString();
    }
}
