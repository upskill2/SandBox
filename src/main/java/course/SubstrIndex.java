package course;

public class SubstrIndex {

    public int substrIndex(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();
        for(int i = 0; i <= n-m; i++){
            boolean found = true;
            for(int j = 0; j < m; j++){
                if(str1.charAt(i+j) != str2.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        SubstrIndex subs = new SubstrIndex();
           subs.substrIndex("inside", "side");
        subs.substrIndex("ab", "bb");
        subs.substrIndex("bababbba", "abb");
    }

  /*var items = list.stream()..map(...).filter(...);

    var innerItems = items.filter(...).toList();
    log.info("innerItems: {}", innerItems);

    var outerItems = items.filter(...).toList();
    log.info("outerItems : {}", outerItems );*/


}
