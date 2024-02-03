package org.example.controlFlow;

public class BarkingDog {
        public static boolean shouldWakeUp(boolean barking, int hourOfDay){
            boolean wakeUp=true;
            if (!barking) {
                wakeUp=false;
            }else if (hourOfDay<0||hourOfDay>23) {
                return wakeUp=false;
            } else if (hourOfDay>=0&&hourOfDay<8){
                return wakeUp=true;
            }else if (hourOfDay>22&&hourOfDay<=23){
                return wakeUp=true;
            } else if (hourOfDay>8||hourOfDay<=22){
                return wakeUp=false;
            }
            return wakeUp;
        }
}
