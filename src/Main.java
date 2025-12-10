import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        ArrayList<String> lines = getFileData("src/data");
//        String[] ranges = getFileData("src/data").get(0).split(",");
        ArrayList<String> data=getFileData("src/data");
        int partOneAnswer;
        long partTwoAnswer;
        partOneAnswer=getPartOneNumber(data);
        partTwoAnswer=getPartTwoNumber(data);
        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static int getPartOneNumber(ArrayList<String> input) {
        int out=0;
        String newRes="";
        boolean caseB;
        for (int lines = 0; lines < input.size(); lines++) {
            int thing=0;
            caseB=false;
            for (int i = 9; i >0; i--) {
                for (int j = 0; j < input.get(lines).length(); j++) {
                    if (Integer.parseInt(input.get(lines).substring(j, j+1))==i){
                        if (j!=input.get(lines).length()-1){
                            newRes=input.get(lines).substring(j+1);
                            thing+=i*10;
                            i=0;
                        } else {newRes=input.get(lines).substring(0, input.get(lines).length()-1); thing+=i; i=0; caseB=true;}
                    }
                }
            }
            for (int i = 9; i >0; i--) {
                for (int j = 0; j < newRes.length(); j++) {
                    if (Integer.parseInt(newRes.substring(j, j+1))==i){
                        if (caseB){
                            thing+=10*i;
                        } else {
                            thing += i;
                        }
                        i=0;
                    }
                }
            }
            System.out.println(thing);
            out+=thing;
        }
        return out;
    }

    public static long getPartTwoNumber(ArrayList<String> input) {
        long out=0L;
        for (int i = 0; i < input.size(); i++) {//Loops through each input
            long number=0L;
            String res=input.get(i);
            int x=11;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the first digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the second digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the third digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the fourth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the fifth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the sixth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the seventh digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the eighth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the ninth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the tenth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the eleventh digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            x--;
            for (int j = 9; j > 0; j--) {//GOAL: Capture the twelfth digit
                for (int k = 0; k <res.length()-x; k++) {
                    if (Integer.parseInt(res.substring(k, k+1))==j){
                        number+= ((long)j*(long)Math.pow(10, x));
                        res=res.substring(k+1);
                        j=0;
                    }
                }
            }
            System.out.println(input.get(i));
            System.out.println(number);
            out+=number;
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