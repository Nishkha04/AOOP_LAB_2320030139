package com.co1;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Fan kitchenFan = new Fan("Kitchen");
        TV bedroomTV = new TV("Bedroom");
        Command lightOn = new TurnOnCommand(livingRoomLight);
        Command lightOff = new TurnOffCommand(livingRoomLight);

        Command fanOn = new TurnOnCommand(kitchenFan);
        Command fanOff = new TurnOffCommand(kitchenFan);

        Command tvOn = new TurnOnCommand(bedroomTV);
        Command tvOff = new TurnOffCommand(bedroomTV);
        RemoteControl remote = new RemoteControl();
        System.out.println("Testing Light:");
        remote.setCommand(lightOn);
        remote.pressButton(); 
        remote.pressUndo();  
        System.out.println("\nTesting Fan:");
        remote.setCommand(fanOn);
        remote.pressButton(); 
        remote.setCommand(fanOff);
        remote.pressButton(); 
        System.out.println("\nTesting TV:");
        remote.setCommand(tvOn);
        remote.pressButton(); 
        remote.setCommand(tvOff);
        remote.pressButton();
    }
}
