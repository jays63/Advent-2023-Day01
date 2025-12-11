import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> data=getFileData("src/data");
        String[][] DAY4=new String[data.size()+2][data.getFirst().length()+2];
        for (int i = 1; i < data.size()+1; i++) {
            for (int j = 1; j < DAY4[i].length-1; j++) {
                DAY4[i][j]= data.get(i-1).substring(j-1, j);
            }
        }
        for (int i = 0; i < DAY4.length; i++) {
            for (int j = 0; j < DAY4[i].length; j++) {
                if (DAY4[i][j]==null)
                    DAY4[i][j]=".";
            }
        }
        int partOneAnswer;
        int partTwoAnswer;
        partOneAnswer=getPartOneNumber(DAY4);
        partTwoAnswer=getPartTwoNumber(DAY4);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static int getPartOneNumber(String[][] in) {
        int out=0;
        for (int i = 1; i < in.length; i++) {
            for (int j = 1; j < in[i].length; j++) {
                if (in[i][j].equals("@")){
                    int count=0;
                    if (in[i+1][j].equals("@")){
                        count++;
                    }
                    if (in[i-1][j].equals("@")){
                        count++;
                    }
                    if (in[i][j-1].equals("@")){
                        count++;
                    }
                    if (in[i][j+1].equals("@")){
                        count++;
                    }if (in[i+1][j+1].equals("@")){
                        count++;
                    }
                    if (in[i+1][j-1].equals("@")){
                        count++;
                    }
                    if (in[i-1][j-1].equals("@")){
                        count++;
                    }
                    if (in[i-1][j+1].equals("@")){
                        count++;
                    }
                    if (count<4)
                        out++;
                }
            }
        }
        return out;
    }

    public static int getPartTwoNumber(String[][] in) {
        int out=0;
        for (int z=0; z<(in.length-2)*(in[0].length-2); z++) { //Problem line
            for (int i = 1; i < in.length; i++) {
                for (int j = 1; j < in[i].length; j++) {
                    if (in[i][j].equals("@")) {
                        int count = 0;
                        if (in[i + 1][j].equals("@")) {
                            count++;
                        }
                        if (in[i - 1][j].equals("@")) {
                            count++;
                        }
                        if (in[i][j - 1].equals("@")) {
                            count++;
                        }
                        if (in[i][j + 1].equals("@")) {
                            count++;
                        }
                        if (in[i + 1][j + 1].equals("@")) {
                            count++;
                        }
                        if (in[i + 1][j - 1].equals("@")) {
                            count++;
                        }
                        if (in[i - 1][j - 1].equals("@")) {
                            count++;
                        }
                        if (in[i - 1][j + 1].equals("@")) {
                            count++;
                        }
                        if (count < 4) {
                            out++;
                            in[i][j] = ".";
                        }
                    }
                }
            }
        }
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