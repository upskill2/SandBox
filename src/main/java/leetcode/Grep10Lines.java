package leetcode;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Grep10Lines {

    public static void readFile(String file) {


        try {

            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            Pattern p = Pattern.compile("Line[\\s][0-9]{1,2}");  //[abc]{4}[\\s][0-9]

            String line = "";
            while ((line=br.readLine()) != null) {
         //       System.out.println(line);
                Matcher m = p.matcher(line);
                while (m.find()) {
                         //      System.out.print(m.start() + " " + m.group() + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read10Line(String file){

        try{
            String line;
            String n = "";

            Stream<String> lines = Files.lines(Paths.get(file));

                line = lines.skip(5).findFirst().get();
                System.out.println(line);

        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String file = "src/main/java/leetcode/resources/10Lines.txt";
        readFile(file);
        read10Line(file);
    }

}
