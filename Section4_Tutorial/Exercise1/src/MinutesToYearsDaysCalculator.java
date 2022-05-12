import java.awt.*;

public class MinutesToYearsDaysCalculator {


    static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;
        }
        return Math.round(kilometersPerHour * 1.609);
    }

    static void printConversion(double kilometersPerHour){
        System.out.println( kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h.");
    }

    public static void main(String[] args) {
//        MinutesToYearsDaysCalculator m = new MinutesToYearsDaysCalculator();
//        System.out.println(m.toMilesPerHour(3.3));


        printConversion(3.3);

    }
}
