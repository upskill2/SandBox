package leetcode;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;
        for (String str : words) {
            for (int i = 0; i < str.length(); i++) {
                if(!allowed.contains(String.valueOf(str.charAt(i)))  ){
                   count--;
                   break;
                }
            }
        }

        return words.length+count;
    }

    public static void main(String[] args) {
        CountTheNumberOfConsistentStrings c = new CountTheNumberOfConsistentStrings();

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        c.countConsistentStrings(allowed,words);
    }

}

/*    Set<Character> chSet = getCharSet(allowed);
        return (int)Arrays.stream(words).map(this::getCharSet).filter(chSet::containsAll).count();
                }

        private Set<Character> getCharSet(String word)
        {
        return word.chars().mapToObj(e -> (char)e).collect(Collectors.toSet());*/
