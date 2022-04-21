public class MegaBytesConverter {

    static int megaBytes = 1;
    static int kiloBytes = 1024;


    public static int megaBytes(int kiloBytes) {
        if (megaBytes < 0) {
            return -1;
        }
        return kiloBytes / megaBytes;
    }

    public static void printMegaBytesAndKiloBytes(){

        if
    }


}
//
//XX = original value kiloBytes
//YY = calculated megabytes
//ZZ = calculated remaining kilobytes

// kiloBytes is less than 0 "Invalid Value"
// YY < 0 return ("Invalid Value")
// print format "XX KB = YY MB and ZZ KB"
// remainder operator '%'
// 1 MB = 1024 KB

