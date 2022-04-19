public class Primitive {

    public static void main(String[] args) {

        byte byteValue = 90;
        short shortValue = 80;
        int intValue = 30;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));

    }
}