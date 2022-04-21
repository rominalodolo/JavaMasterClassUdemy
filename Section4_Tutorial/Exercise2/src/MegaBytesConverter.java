public class MegaBytesConverter {

    int kilobytes = XX;
    int megabytes = YY;
    int remainder = ZZ;

    public static void printMegaBytesAndKiloBytes {
        System.out.println(printMegaBytesAndKiloBytes(2500));
        System.out.println(printMegaBytesAndKiloBytes(-1024));
        System.out.println(printMegaBytesAndKiloBytes(5000));
    }


}
//
//XX = original value kiloBytes
//YY = calculated megabytes
//ZZ = calculated remaining kilobytes

// kiloBytes is less than 0 "Invalid Value"
// YY < 0 return ("Invalid Value")
// print format "XX KB = YY MB and ZZ KB"
// remainder operator
// 1 MB = 1024 KB
