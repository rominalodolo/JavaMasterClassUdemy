public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay < 0 | hourOfDay > 23) { // arguments are out of range i.e. invalid

            if (barking) { // dog is barking, so check the time
                if (hourOfDay >= 22 & hourOfDay <= 8) {  // if the time is in tht sleep hours then return true
                    return true; // must wake up
                }else {
                    return false;
                }
            } else { // no need to wake
                return false;
            }

        } else { // valid argument
            return true;
        }
    }

    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp (false, 2);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);
    }
}



