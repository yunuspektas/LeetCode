package Q3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        System.out.println(angleClock(1, 57));

    }

    public static double angleClock(int hour, int minutes) {
//        double ek = (double)minutes/12;
//        System.out.println("ek = " + ek);
//
//
//        double hourAci = ((hour%12)*30)+(ek*6);
//        System.out.println("hourAci = " + hourAci);
//
//
//
//
//
//
//        double newMinute = (double)minutes/5;
//        System.out.println("newMinute = " + newMinute);
//        double minuteAci = (newMinute)*30;
//        System.out.println("minuteAci = " + minuteAci);
//
//
//        if(Math.abs(hourAci- minuteAci)>180) return (360- Math.abs(hourAci- minuteAci));
//        else return (Math.abs(hourAci- minuteAci));
        double  angle=Math.abs(5.50* minutes-30*hour);  // kısa yol 5.50 = 6- 6/12 den geliyor;
        if(angle>180){
            return 360-angle;
        }
        return angle;




    }
}
