// File: Main.java

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Remote control
        RemoteControl remote = new RemoteControl();

        // Turn light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light OFF
        remote.setCommand(lightOff);
        remote.pressButton();

        // Press without setting command
        remote.setCommand(null);
        remote.pressButton();
    }
}
