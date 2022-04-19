package ByteShortIntLong;

public class Main {
    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

        // int myMaxIntTest = 639076625415;
        int myMaxIntTest = 2_146_987_786;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinLongValue);
        System.out.println("Short Maximum Value = " + myMaxLongValue);

        // long myMaxLongTest = 2_146_987_786_234;
        long myMaxLongTest = 2_146_987_786_234L;

        // Casting
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewSHortValue = (short)( myMinShortValue / 2 );

    }
}
