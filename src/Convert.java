/**
 * Created with IntelliJ IDEA.
 * User: Dan
 * Date: 5/16/13
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class Convert {

    public static void main(String[] args) {
        System.out.println("Hey");
        Duration example = new Duration(0,0,0,0,200000);
        System.out.println (example);
        Duration newTime = convertMicrowaveTime(example, 1200, 1000);
        System.out.println (newTime);

    }

    public static Duration convertMicrowaveTime(Duration requiredDuration, int requiredPower, int currentPower) {
        long newTime = (requiredDuration.toMilliSeconds()*requiredPower) / currentPower;
        Duration newDuration = new Duration(0,0,0,0,newTime);
        return newDuration;
    }



}
