public class TimeConversion{
    private int hour;
    private int minute;
    private int second;
    /* private int EST;
    private int CST;
    private int PST;
    */
    // default constructor
    public TimeConversion(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    // overloaded constructor
    public TimeConversion(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //setters

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // methods


}
