import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        ArrayList<String> lines = getFileData("src/data");
        String[] ranges = getFileData("src/data").get(0).split(",");
        Long partOneAnswer;
        Long partTwoAnswer;
        partOneAnswer=getPartOneNumber(ranges);
        partTwoAnswer=getPartTwoNumber(ranges);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static Long getPartOneNumber(String[] ranges) {
        Long invSum= 0L;
        System.out.println(Arrays.toString(ranges)); //DEBUG PRINT
        for (int i = 0; i < ranges.length; i++) {
            String[] things=ranges[i].split("-");
            Long minNum=Long.parseLong(things[0]);
            Long maxNum=Long.parseLong(things[1]);
            for (Long j = minNum; j <= maxNum; j++) {
                String thing=""+j;
                if (thing.length()%2==0){
                    String first=thing.substring(0, thing.length()/2);
                    String second=thing.substring(thing.length()/2);
                    if (first.equals(second)) {
                        invSum += j;
                    }
                }
            }
        }
        return invSum;
    }

    public static Long getPartTwoNumber(String[] ranges) {
        Long invSum=0L;
        System.out.println(Arrays.toString(ranges)); //DEBUG PRINT
        for (int i = 0; i < ranges.length; i++) {
            String[] things=ranges[i].split("-");
            Long minNum=Long.parseLong(things[0]);
            Long maxNum=Long.parseLong(things[1]);
            for (Long j = minNum; j <= maxNum; j++) {
                String thing = Long.toString(j);
                for (int x=1; x<thing.length(); x++){
                    String pattern=thing.substring(0, x);
                    String temp=thing;
                    int a=pattern.length();
                    while (a<=temp.length()){
                        if (!temp.substring(0, a).equals(pattern)){
                            break;
                        }
                        temp=temp.substring(a);
                    }
                    if (temp.isEmpty()){
                        invSum+=Long.parseLong(thing);
                        System.out.println(thing);
                        break;
                    }
                }
            }
        }
        return invSum;
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