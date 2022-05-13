public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay < 0 | hourOfDay > 23) { // arguments are out of range i.e. invalid
            return false;

        } else { // valid argument
            if (barking) { // dog is barking, so check the time
                if ((hourOfDay > 22) || (hourOfDay < 8)) {  // if the time is in tht sleep hours then return true
                    return true; // must wake up
                }else {
                    return false;
                }
            }else { // no need to wake
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}



