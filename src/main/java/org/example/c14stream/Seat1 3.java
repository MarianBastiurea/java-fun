package org.example.c14stream;

public record Seat1(char rowMarker, int seatNumber, boolean isReserved) {

    public Seat1(char rowMarker, int seatNumber) {
//        this(rowMarker, seatNumber, new Random().nextBoolean());
        this(rowMarker, seatNumber, false);
    }
}
