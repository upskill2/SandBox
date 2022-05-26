package leetcode;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumbers {

    public static void readFile(String file) {

        {
            try {
                List<String> listLines = new ArrayList();

                BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                Pattern pattern = Pattern.compile("([(])?\\d{3}([)])?(\\s)?([-])?[0-9]{3}-[0-9]{4}"); //udemy https://www.youtube.com/watch?v=hCz2M_q7UC0&ab_channel=УрокиJava
                                                            //java doc https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
                                                            // [+/-] literal - exact match inside

                //Lookbehind https://www.regular-expressions.info/lookaround.html

                                                            // []\^$.|?*+() -- \\-skip metacharacter
                                                            // "\\Qcat\\E" - exact match inside Q-E
                                                            // "[0-5a-z]" - any number between 0-5 and chars a-z
                                                            // "[gr[ae]y]"  - a or e inside the gry
                                                            // ]|^-
                                                            // [^] - negation Iraq is a country "q[^u]"
                                                            // ^ only at the beginning
                                                            // []] - anything inside [] is not a metacharacter
                                                            // [\\\\] - to find a slash
                                                            // \\d = [0-9]- predefined class - any number
                                                            // \\w = [a-zA-Z]- predefined class - any char
                                                            // \\s = tab or white space
                                                            // - . anything
                                                            // "\\d\\d.\\d\\d.\\d\\d"
                                                            // [0-9]{3}[-/.][0-9]{3}[-/.][0-9]{4} - [-/.] - separator
                                                            // "\".*\"" - greedy, anyting instring between \"   \"
                                                            // "\".*?\"" - not greed
                                                            // word boundaries \\bis\\b - look ups only "is"
                                                            // "^a" string starts from a, not in []
                                                            // "s$" - end of string
                                                            // "^\\d+$" - check only numbers in string
                                                            // multi line "/n" ("ne$",Pattern.MULTILINE)
                                                            // | pipeline=OR "pig|bird"
                                                            // "Set|SetValue|Get|GetValue"
                                                            // Optional items "colou?r", "Nov(ember)??"
                                                            // "Nov(ember)??" add reluctant 2nd?- will not look for ember        "Nov(ember)?"
                                                            //"Sep(tember)? 17(th)?"
                                                            // Repetition: "a*" any symbols, "a+" - minimum 1 time or more
                                                            // html tags "<[a-zA-Z][a-zA-Z0-9]*"
                                                            //{3} - # of symbols in string
                                                            // "<.+>" greedy by default use <.+?> find tags. Or can use "<[^>]+>"
                                                            // "\\Q*\\\\d+**\\E+" to find *\\d+**\\d+*
                                                            //Group Set?:(Value)?\\1 - :? means - not create backreferences
                                                            // "EditPad (Lite|Pro)"
                                                            // unicode "\\u0040"
                                                            //Pattern.CASE_INSENSITIVE
                                                            //lookAround lookahead "we(?=s)" or negation "we(?!s|n)"
                                                            //lookAround lookbehind "(?<!x)z"
                                                            //lookaround "(?=\\b\\w{6,12}\\b)\\w{0,3}(psh|isl)\\w*"
                                                            //jregex with ifElse "(a)?b(?(1)c|d)";
                                                            // ignore free space "(?x)a b c "
                                                            //"\\d\\d\\d([-\\s])?\\d\\d\\d\\d"


                String line;

                while ((line = br.readLine()) != null) {
                    Matcher m = pattern.matcher(line);
                 //   System.out.println(line);
                    while(m.find()){
               System.out.print(m.start() + " "  + m.group() + " " );
                    }
                               }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        String file = "src/main/java/leetcode/resources/phone_numbers.txt";
        readFile(file);
    }

}
