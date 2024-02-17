package org.example.c03.inheritance;

public class Room {
    private String name;
    protected double size;
    protected int windowNumber;
    protected String windowOpen;
    protected int  numberOfDoor;

    public Room() {
    }

    public Room(String name, double size, int windowNumber, String windowOpen, int numberOfDoor) {
        this.name = name;
        this.size = size;
        this.windowNumber = windowNumber;
        this.windowOpen = windowOpen;
        this.numberOfDoor = numberOfDoor;
    }

    public String getName() {
        return name;
    }

    public String isSleeping(String roomType){
        return switch (roomType){
            case "Living Room", "Bedroom"->"Yes";
            case "Bathroom", "Hall", "Kitchen" ->"No";
            default -> "No";
        };
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", windowNumber=" + windowNumber +
                ", windowOpen='" + windowOpen + '\'' +
                ", numberOfDoor='" + numberOfDoor + '\'' +
                '}';
    }
}
