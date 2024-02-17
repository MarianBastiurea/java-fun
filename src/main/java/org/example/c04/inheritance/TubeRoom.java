package org.example.c04.inheritance;

public class TubeRoom extends Bathroom {
    private String tubeType;

    public TubeRoom(String name, double size, int windowNumber, String windowOpen, int numberOfDoor,
                    String tubeType, String showerType, String sinkType, String mirrorType) {
        super(name, size, windowNumber, windowOpen, numberOfDoor, tubeType, showerType, sinkType, mirrorType);
        this.tubeType = tubeType;
    }

    public String getTubeType() {
        return tubeType;
    }

    public double surface(String tubeType) {
        double surface = switch (tubeType) {
            case "alcove" -> 10;
            case "jetted" -> 12;
            case "corner" -> 9;
            case "freestanding" -> 15;
            default -> 8;
        };
        return surface;
    }
}

