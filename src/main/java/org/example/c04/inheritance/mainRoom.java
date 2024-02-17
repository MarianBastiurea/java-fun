package org.example.c04.inheritance;

public class mainRoom {
    public static void main(String[] args) {
        Room livingroom = new Room("Living Room", 25, 4, "Inside", 3);
        System.out.println(livingroom);
        System.out.println("Room type is " + livingroom.getName());
        System.out.println("It's necessary more space for a bed ?" + livingroom.isSleeping(livingroom.getName()));

        Bathroom smallBathroom = new Bathroom("Small Bathroom", 4.5, 1, "inside",
                1, "no", "no", "normal", "small");
        System.out.println(smallBathroom);

        ShowerRoom normalShowerRoom = new ShowerRoom("normal", 5.5, 1, "Inside",
                1, "no", "classic", "fancy", "huge",
                "rectangular");
        System.out.println(normalShowerRoom);
        System.out.println("How many square meter I need more:" +
                normalShowerRoom.surface(normalShowerRoom.getEnclosureType()));

        TubeRoom spacious = new TubeRoom("Spacious", 15.5, 2, "outside",
                1, "freestanding", "semi-oval",
                "double sink", "huge");
        System.out.println(spacious);
        System.out.println("How many square meter I need more:" + spacious.surface(spacious.getTubeType()));
        double extraSpace = normalShowerRoom.surface(normalShowerRoom.getEnclosureType()) +
                spacious.surface(spacious.getTubeType());
        System.out.println("Total extra space needed for a modern house: " + extraSpace);
    }
}
