public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB.");
    }


    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}

