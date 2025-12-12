import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> data=getFileData("src/data");
        int idx=1;
        while (data.get(idx).contains("-")){
            idx++;
        }
        String[] ranges= (data.subList(0, idx)).toArray(new String[idx]);
        String[] numbers= (data.subList(idx + 1, data.size())).toArray(new String[data.size()-idx-1]);
//        Everything works here
        int partOneAnswer;
        long partTwoAnswer;
        partOneAnswer=getPartOneNumber(ranges, numbers);
        partTwoAnswer=getPartTwoNumber(data);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static int getPartOneNumber(String[] ranges, String[] numbers) {
        int out=0;
        for (int i=0; i<ranges.length; i++){
            System.out.println(ranges[i]);
            long lowerBound=Long.parseLong(ranges[i].split("-")[0]);
            System.out.println(lowerBound);
            long upperBound=Long.parseLong(ranges[i].split("-")[1]);
            System.out.println(upperBound);
            for (int j = 0; j < numbers.length; j++) {
                if (j>=lowerBound && j<=upperBound){
                    out++;
                    numbers[j]="-1000";
                }
            }
        }
        return out;
    }

    public static long getPartTwoNumber(ArrayList<String> data) {
        long out=0;
        return out;
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