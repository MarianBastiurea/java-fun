package org.example.controlFlow;

public class MegaBytesConverter {
    public static String printMegaBytesAndKiloBytes(int kiloBytes) {
        String result;
        if (kiloBytes < 0) {
            result = "Invalid Value";
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            result = kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB";
        }
        return result;
    }
}
