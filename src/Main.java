import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String> lines = getFileData("src/data");

        int partOneAnswer = 0;
        int partTwoAnswer = 0;
        for (int i = 0; i < lines.size(); i++) {
            partOneAnswer += getPartOneNumber(lines.get(i));
            partTwoAnswer += getPartTwoNumber(lines.get(i));
        }

        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static int getPartOneNumber(String line) {
        String res = "";
        int i=0;
        while (i<line.length()){
            if (line.substring(i, i+1).equals("0")|| line.substring(i, i+1).equals("1") || line.substring(i, i+1).equals("2") || line.substring(i, i+1).equals("3") || line.substring(i, i+1).equals("4") ||
                    line.substring(i, i+1).equals("5") || line.substring(i, i+1).equals("6") || line.substring(i, i+1).equals("7") || line.substring(i, i+1).equals("8") || line.substring(i, i+1).equals("9")) {
                i=line.length()-1;
                res+=line.substring(i, i+1);
                break;
            }
            i++;
        }
        while (i>=0){
            if (line.substring(i, i+1).equals("0") || line.substring(i, i+1).equals("1") || line.substring(i, i+1).equals("2") || line.substring(i, i+1).equals("3") || line.substring(i, i+1).equals("4") ||
                    line.substring(i, i+1).equals("5") || line.substring(i, i+1).equals("6") || line.substring(i, i+1).equals("7") || line.substring(i, i+1).equals("8") || line.substring(i, i+1).equals("9")) {
                i=0;
                res+=line.substring(i, i+1);
                break;
            }
            i--;
        }
        System.out.println(res);
        return Integer.parseInt(res);
    }

    public static int getPartTwoNumber(String line) {
        // do part 2
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