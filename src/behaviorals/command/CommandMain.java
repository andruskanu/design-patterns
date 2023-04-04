package behaviorals.command;

public class CommandMain {

    public static void main(String[] args) {

        Television tv = new Television();

        DeviceButton on = new DeviceButton(new TurnOnCommand(tv));
        DeviceButton off = new DeviceButton(new TurnOffCommand(tv));

        on.pressButton();
        off.pressButton();

    }
}
