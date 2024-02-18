package org.example.c03.inheritance;

public class Bathroom extends Room{

    private String tubeType;
    private String showerType;
    private String sinkType;
    private String mirrorType;



    public Bathroom(String name, double size, int windowNumber, String windowOpen, int numberOfDoor,
                    String tubeType, String showerType, String sinkType, String mirrorType) {
        super(name, size, windowNumber, windowOpen, numberOfDoor);
        this.tubeType = tubeType;
        this.showerType = showerType;
        this.sinkType = sinkType;
        this.mirrorType = mirrorType;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "tubeType='" + tubeType + '\'' +
                ", showerType='" + showerType + '\'' +
                ", sinkType='" + sinkType + '\'' +
                ", mirrorType='" + mirrorType + '\'' +
                '}'+super.toString();
    }
}

