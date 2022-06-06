package leetcode.resources;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFileRead {

  public static void testFileRead (String files) {

        try {
            String line;
            String line1;

            ///Impl #1

            BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(files));
            BufferedReader br1 = new BufferedReader(new InputStreamReader(fis1));

            Pattern p = Pattern.compile("wer");
            Matcher m = p.matcher(br1.readLine());

            while((line1=br1.readLine())!=null){
                System.out.println(line1);

            }



            ////Impl #2
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(files));
            BufferedReader br = new BufferedReader(new FileReader(files));

            while((line=br.readLine())!=null){
        //        System.out.println(line);

           }

            ///Impl #3

            File file = new File(files);

            BufferedReader br3 = new BufferedReader(new FileReader(file));
            while ((line = br3.readLine()) != null) {
           //     System.out.println(line);
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
      testFileRead("src/main/java/leetcode/resources/10Lines.txt");

    }

}
