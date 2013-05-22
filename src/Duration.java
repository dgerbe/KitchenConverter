/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 5/18/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Duration {
    private long days;
    private long hours;
    private long minutes;
    private long seconds;
    private long milliseconds;

    public Duration(long aDays, long aHours, long aMinutes, long aSeconds, long aMilliSeconds) {
        days = aDays;
        hours = aHours;
        minutes = aMinutes;
        seconds = aSeconds;
        milliseconds = aMilliSeconds;

        long extraSeconds;
        long extraMinutes;
        long extraHours;
        long extraDays = 0;

        if (milliseconds >= 1000) {
            extraSeconds =  milliseconds / 1000;
            seconds += extraSeconds;
            milliseconds -= extraSeconds * 1000;
        }
        if (seconds >= 60) {
            extraMinutes =  seconds / 60;
            minutes += extraMinutes;
            seconds -= extraMinutes * 60;
        }

        if (minutes >= 60) {
            extraHours =  hours / 60;
            hours += extraHours;
            minutes -= extraHours * 60;
        }
        if (extraDays >= 24) {
            extraDays =  hours / 24;
            days += extraDays;
            hours -= extraDays * 24;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds, " + milliseconds +" milliseconds" + NEW_LINE);
        result.append("}");

        return result.toString();
    }
    public long getDays() {
        return days;
    }

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public long getSeconds() {
        return seconds;
    }

    public long getMilliSeconds() {
        return milliseconds;
    }

    public long toMilliSeconds() {
        return (days*86400000 + hours*3600000 + minutes*60000 + seconds*1000 + milliseconds);
    }

}
