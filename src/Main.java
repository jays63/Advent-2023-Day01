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
        partOneAnswer=getPartOneNumber(lines);
        partTwoAnswer=getPartTwoNumber(lines);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static int getPartOneNumber(ArrayList<String> lines) {
        int pos=50;
        int count=0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).charAt(0) == 'L') {
                pos -= Integer.parseInt(lines.get(i).substring(1));
                while (pos < 0) {
                    pos += 100;
                }
            }
            else if (lines.get(i).charAt(0) == 'R') {
                pos += Integer.parseInt(lines.get(i).substring(1));
                while (pos >= 100) {
                    pos -= 100;
                }
            }
            if (pos == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getPartTwoNumber(ArrayList<String> lines) {
        int pos=50;
        int count=0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).charAt(0) == 'L') {
                for (int x = Integer.parseInt(lines.get(i).substring(1)); x > 0 ; x--) {
                    pos--;
                    if (pos%100==0) {
                        pos=0;
                        count++;
                    }
                }
                if (pos < 0)
                    pos+=100;
            }
            else if (lines.get(i).charAt(0) == 'R') {
                for (int x = Integer.parseInt(lines.get(i).substring(1)); x > 0; x--){
                    pos++;
                    if (pos%100==0) {
                        pos=0;
                        count++;
                    }
                    if (pos > 100) {
                        pos-=100;
                    }
                }
            }
            System.out.println("Position: "+pos+" Count: "+count+" Line: "+(1+i));
        }
        return count;
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