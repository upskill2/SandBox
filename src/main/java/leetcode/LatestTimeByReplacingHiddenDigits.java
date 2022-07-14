package leetcode;

public class LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < time.length(); i++) {
            char ch = time.charAt(i);
            if (ch == '?') {

                switch (i) {
                    case 0:
                        if (time.charAt(1) < '4' || time.charAt(1) == '?') {
                            sb.append(2);
                        } else {
                            sb.append(1);
                        }

                        break;

                    case 1:
                        if (time.charAt(0) == '?' || time.charAt(0) == '2') {
                            sb.append(3);
                        } else {
                            sb.append(9);
                        }
                        break;

                    case 3:
                        sb.append('5');
                        break;

                    case 4:
                        sb.append('9');
                        break;
                }

            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LatestTimeByReplacingHiddenDigits la = new LatestTimeByReplacingHiddenDigits();

        String time = "2?:?0";
        String time1 = "0?:3?";
        String time2 = "1?:22";
        String time3 = "?4:03";
        String time4 = "??:3?";

/*        la.maximumTime(time);
        la.maximumTime(time1);
        la.maximumTime(time2);*/
        //   la.maximumTime(time3);
        la.maximumTime(time4);
    }

}
