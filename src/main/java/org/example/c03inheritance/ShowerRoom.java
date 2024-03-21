package org.example.c03inheritance;

public class ShowerRoom extends Bathroom {
    private String enclosureType;

    public ShowerRoom(String name, double size, int windowNumber, String windowOpen, int numberOfDoor,
                      String tubeType, String showerType, String sinkType, String mirrorType, String enclosureType) {
        super(name, size, windowNumber, windowOpen, numberOfDoor, tubeType, showerType, sinkType, mirrorType);
        this.enclosureType = enclosureType;
    }


    public String getEnclosureType() {
        return enclosureType;
    }

    public double surface(String enclosureType) {
        double surface = switch (enclosureType) {
            case "rectangular" -> 4;
            case "square" -> 6;
            case "semi-oval" -> 7;
            case "half-circle" -> 5;
            default -> 5.5;
        };
        return surface;
    }

    public int getWindowNumber() {
        return windowNumber=1;
    }


    @Override
    public String toString() {
        return "ShowerRoom{" +
                "size=" + size +
                ", windowNumber=" + windowNumber +
                ", windowOpen='" + windowOpen + '\'' +
                ", numberOfDoor='" + numberOfDoor + '\'' +
                '}';
    }
}

