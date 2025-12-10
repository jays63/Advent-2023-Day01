import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> data=getFileData("src/data");
        String[][] DAY4=new String[data.get(0).length()+2][data.size()+2];
        int partOneAnswer;
        int partTwoAnswer;
        partOneAnswer=getPartOneNumber(data);
        partTwoAnswer=getPartTwoNumber(data);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static int getPartOneNumber(ArrayList<String> input) {
        int out=0;
        return out;
    }

    public static int getPartTwoNumber(ArrayList<String> input) {
        int out=0;
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