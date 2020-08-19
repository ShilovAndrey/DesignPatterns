package pattern_command.command;

public interface Command {
    void execute();

    void undo();
}

class NoCommand implements Command {
    public void execute() {
    }

    public void undo() {
    }
}