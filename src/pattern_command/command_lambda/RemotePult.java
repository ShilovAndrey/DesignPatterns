package pattern_command.command_lambda;


public class RemotePult {
    Command[] onCommands;
    Command[] offCommands;

    public RemotePult(){
        onCommands=new Command[7];
        offCommands=new Command[7];
        for (int i = 0; i < onCommands.length ; i++) {
            onCommands[i]=()->{};
            offCommands[i]=()->{};
        }
    }

    public void setPultCommands(int buttonNumber, Command onComm, Command offComm){
        onCommands[buttonNumber]=onComm;
        offCommands[buttonNumber]=offComm;
    }

    public void pushedOnButton(int buttonNumber){
        onCommands[buttonNumber].execute();
    }

    public void pushedOffButton(int buttonNumber){
        offCommands[buttonNumber].execute();
    }
    public String toString(){
        StringBuilder builderLine = new StringBuilder();
        builderLine.append("------------------Remote control----------------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builderLine.append("[slot "+i+"]"+" "+onCommands[i].getClass().getName()+"         "+offCommands[i].getClass().getName()+" \n");
        }
        return builderLine.toString();
    }
}
