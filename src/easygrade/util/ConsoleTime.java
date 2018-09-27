package easygrade.util;

import easygrade.Main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ConsoleTime {

    public static void printLog(String message)
    {

        System.out.println(getTime() + " " + message);
    }

    private static String addZerosSecMin(Integer number)
    {
        if(number < 10){
            return "0" + number.toString();
        } else {
            return number.toString();
        }
    }

    private static String addZerosMill(Integer number)
    {
        if(number < 10){
            return "00" + number.toString();
        } else if (number > 10 && number < 100){
            return "0" + number.toString();
        } else {
            return number.toString();
        }
    }

    private static String getTime()
    {
        long end = System.currentTimeMillis();
        int timelapsed = (int)(end - Main.start_time);
        int millis = timelapsed % 1000;
        int seconds = (timelapsed / 1000) % 60;
        int minutes = (timelapsed / 1000) / 60;

        NumberFormat minandsec = new DecimalFormat("#00");
        return "[" + minandsec.format(minutes) + ":" + minandsec.format(seconds) + "." + millis + "]";
    }

}
