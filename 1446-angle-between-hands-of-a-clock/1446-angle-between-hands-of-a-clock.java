class Solution {
    public double angleClock(int hour, int minutes) {
        int ans = 0;

        double minute = 30*(hour) - (5.5)*minutes;
        minute = Math.abs(minute);

        if(minute <= 180){
            return minute;
        }
        else return 360 - minute;
        
    }
}