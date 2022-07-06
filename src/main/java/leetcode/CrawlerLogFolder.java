package leetcode;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {

        int coundSubfloders = 0;
        for (String folder : logs) {
            if (folder.charAt(0) != '.') {
                coundSubfloders++;
            } else {
                if (folder.startsWith("..")) {
                    if (coundSubfloders != 0) {
                        coundSubfloders--;
                    }
                }
            }
        }

        return coundSubfloders;
    }

    public static void main(String[] args) {
        CrawlerLogFolder craw = new CrawlerLogFolder();
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs1 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        String[] logs2 = {"d1/", "../", "../", "../"};

       craw.minOperations(logs);
       craw.minOperations(logs1);
       craw.minOperations(logs2);
    }

}
