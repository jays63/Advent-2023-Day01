import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        ArrayList<String> lines = getFileData("src/data");
        String[] ranges = getFileData("src/data").get(0).split(",");
        long partOneAnswer;
        int partTwoAnswer;
        partOneAnswer=getPartOneNumber(ranges);
        partTwoAnswer=getPartTwoNumber(ranges);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static long getPartOneNumber(String[] ranges) {
        long invSum=0;
        System.out.println(Arrays.toString(ranges)); //DEBUG PRINT
        for (int i = 0; i < ranges.length; i++) {
            String[] things=ranges[i].split("-");
            System.out.println(Arrays.toString(things));
            long minNum=Long.parseLong(things[0]);
            long maxNum=Long.parseLong(things[1]);
            for (long j = minNum; j <= maxNum; j++) {
                String thing=""+j;
                if (thing.length()%2==0){
                    String first=thing.substring(0, thing.length()/2);
                    String second=thing.substring(thing.length()/2);
                    if (first.equals(second)) {
                        invSum += j;
//                        System.out.println(j); DEBUG PRINT
                    }
                }
            }
        }
        return invSum;
    }

    public static int getPartTwoNumber(String[] ranges) {
        return 0;
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}