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
            if (Character.isDigit(line.charAt(i))) {
                res+=line.substring(i, i+1);
                i=line.length()-1;
                break;
            }
            i++;
        }
        while (i>=0){
            if (Character.isDigit(line.charAt(i))){
                res+=line.substring(i, i+1);
                break;
            }
            i--;
        }
        return Integer.parseInt(res);
    }

    public static int getPartTwoNumber(String line) {
        String res = "";
        int i=0;
        while (i<line.length()){
            System.out.println(line);
            if (Character.isDigit(line.charAt(i))) {
                res+=line.substring(i, i+1);
                i=line.length()-1;
                break;
            }
            else if (line.length()-i > 5 &&
                    (line.substring(i, i+5).contains("one") ||
                    line.substring(i, i+5).contains("two") ||
                    line.substring(i, i+5).contains("three") ||
                    line.substring(i, i+5).contains("four") ||
                    line.substring(i, i+5).contains("five") ||
                    line.substring(i, i+5).contains("six") ||
                    line.substring(i, i+5).contains("seven") ||
                    line.substring(i, i+5).contains("eight") ||
                    line.substring(i, i+5).contains("nine"))){
                String x=line.substring(i, i+5);
                switch (x){
                    case "*one*":
                        res+=1;
                        break;
                    case "*two*":
                        res+=2;
                        break;
                    case "three":
                        res+=3;
                        break;
                    case "*four*":
                        res+=4;
                        break;
                    case "*five*":
                        res+=5;
                        break;
                    case "*six*":
                        res+=6;
                        break;
                    case "seven":
                        res+=7;
                        break;
                    case "eight":
                        res+=8;
                        break;
                    case "*nine*":
                        res+=9;
                        break;
                }
            }
            i++;
        }
        while (i>=0){
            if (Character.isDigit(line.charAt(i))){
                res+=line.substring(i, i+1);
                break;
            }
            i--;
        }
        System.out.println(res);
        return Integer.parseInt(res);
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