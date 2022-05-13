import static java.lang.Math.PI;

public class AreaCalculator {
    public static double area (double radius){
        if ((radius * radius) * PI ){
            return area();
        }else {
            return -1.0;
        }
    }

    public static double area (double x, double y){ //overload method
        if (x * y){

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
}
