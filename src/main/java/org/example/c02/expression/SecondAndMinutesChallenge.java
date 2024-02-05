package org.example.c02.expression;

public class SecondAndMinutesChallenge {
    public static String getDurationString(int seconds) {
        String result = "";
        int minutes, remainingSeconds;
        if (seconds < 0) {
            result = "Invalid value";
        } else {
            minutes = seconds / 60;
            remainingSeconds = seconds%60;
            result = getDurationString(minutes,remainingSeconds);


        }
        return result;
    }

    public static String getDurationString(int minutes, int seconds) {
        String result = "";
        int hours, remainingMinutes, remainingSeconds;
        if (minutes < 0) {
            result="Invalid value";
        } else if( seconds<0&&seconds>59){
            result="Invalid value";}
        else { hours=minutes/60;
            remainingMinutes=minutes-hours*60;
            remainingSeconds=seconds;
            result=hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
        return result;
    }
}

