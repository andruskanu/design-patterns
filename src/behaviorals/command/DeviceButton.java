package behaviorals.command;

public class DeviceButton {

    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
