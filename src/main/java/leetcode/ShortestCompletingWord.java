package leetcode;

import java.util.*;

public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {

        String extract = licensePlate.replaceAll("[^a-zA-Z]+", "").toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>(); //"1s3 PSt";

              for (char ch : extract.toCharArray()
        ) {                map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        int mapSize = map.size();
        int idx = 0;

        for (int i = 0; i < wordsArrayHashmap(words).size(); i++) {
            idx=0;
            for (char ch : map.keySet()
            ) {
                HashMap<Character, Integer> str = wordsArrayHashmap(words).get(words[i]);
                if (str.containsKey(ch)) {
                    if (str.get(ch) >= map.get(ch)) { //{"stepple", "step", "steps", "stripe"};
                            idx ++;

                            if (idx>=mapSize){
                                return words[i]; }
                    } else break;

                } else break;
            }
        }
       return licensePlate;
    }

    private HashMap<String, HashMap<Character, Integer>> wordsArrayHashmap(String[] words) {
        LinkedHashMap<String, HashMap<Character, Integer>> outerMapWords = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> innerMapWords = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                outerMapWords.put(words[i], innerMapWords);
                innerMapWords.put(words[i].charAt(j), innerMapWords.getOrDefault(words[i].charAt(j), 0) + 1);
                //     outerMapWords.get(words[i]).put(words[i].charAt(j), innerMapWords.getOrDefault(words[i].charAt(j),0)+1);
            }
        }
        return outerMapWords;
    }

    public static void main(String[] args) {

        String licensePlate = "1s3 PSt";
        String[] words = {"stepple", "step", "steps", "stripe"};

        String licensePlate2 = "1s3 456";
        String[] words2 = {"looks","pest","stew","show"};

        String licensePlate1 = "EStpRiD";
        String[] words1 = {"rest","woman","look","prepare","life","condition","beautiful","drive","state","plan","position","image","carry","activity","else","staff","agent","actually","sign","base","yes","structure","computer","itself","because","everybody","respond","less","college","away","finish","imagine","reflect","beyond","black","film","class","discover","very","next","finally","allow","large","music","society","by","miss","hair","population","lay","likely","stock","discussion","author","suffer","commercial","these","draw","food","art","such","water","individual","rise","claim","left","design","develop","necessary","most","effort","foot","hold","everything","mean","animal","west","ever","world","page","same","fall","true","school","sister","service","with","debate","worrying","fear","above","show","property","yard","entire","father","here","lot","talk","process","building","each","employee","beat","adult","where","baby","outside","more","eight","act","take","get","surface","able","writer","during","available","especially","store","various","international","half","high","yourself","degree","drop","thus","us","age","although","six","theory","production","including","office","wear","in","oil","control","parent","money","material","conference","door","do","ok","serve","star","sense","president","hand","simply","case","any","determine","stand","how","card","record","check","color","authority","must","million","probably","radio","drug","ready","detail","live","traditional","industry","her","brother","say","future","blood","tax","indeed","bit","right","table","and","serious","effect","pick","site","attorney","victim","hang","trial","artist","dream","affect","after","mission","trip","land","board","item","option","operation","pull","contain","easy","region","at","pay","east","protect","point","someone","begin","receive","so","that","statement","camera","fund","them","window","send","single","per","news","sure","federal","yeah","common","scientist","view","form","police","decide","dinner","learn","child","phone","white","huge","late","mention","charge","stay","or","trade","policy","morning","purpose","heat","tough","part","disease","dog","technology","team","campaign","practice","avoid","side","old","call","turn","job","give","run","magazine","enjoy","research","choice","chance","series","management","just","new","politics","air","not","difference","time","student","speak","decade","major","answer","stop","language","open","eat","low","upon","ground","city","century","along","political","often","let","gas","training","safe","challenge","as","happen","need","issue","hard","none","evening","against","popular","enough","company","culture","than","mother","man","break","organization","word","only","least","among","explain","real","weight","toward","gun","of","book","my","should","democratic","himself","group","when","church","former","garden","center","senior","according","happy","off","simple","pressure","positive","recently","themselves","particular","care","assume","his","rule","another","soldier","want","economic","death","create","similar","course","could","direction","certainly","fly","vote","letter","court","guy","mind","violence","produce","central","civil","ahead","couple","once","hospital","nothing","if","big","program","personal","instead","shoot","feeling","would","experience","wonder","present","nice","he","full","red","think","put","but","since","impact","friend","spring","quality","deal","professional","ago","reveal","up","walk","bar","prevent","heavy","good","little","treatment","accept","whether","have","no","deep","great","seek","dead","house","customer","country","race","then","involve","play","ask","approach","perhaps","result","exist","station","ability","health","come","fail","return","citizen","early","middle","see","administration","wait","remove","security","between","cell","find","for","blue","go","herself","on","kid","guess","significant","thank","what","you","clearly","from","tell","military","foreign","there","number","hope","others","boy","a","behind","scene","street","tree","experienced","five","near","marriage","fight","north","forget","arm","win","responsibility","notice","room","lead","meet","suddenly","fact","sing","before","nearly","without","important","add","different","sit","maintain","space","type","sort","represent","attention","war","doctor","place","they","party","example","situation","data","majority","also","strong","relationship","score","bill","action","resource","day","discuss","set","few","thousand","partner","far","order","its","value","cancer","heart","interview","reality","director","clear","public","fast","agree","interesting","tonight","attack","coach","myself","ten","son","wind","manager","study","success","kind","meeting","wishing","down","too","peace","maybe","inside","voice","risk","economy","change","improve","information","floor","wall","concern","growth","natural","onto","reduce","nature","main","professor","back","energy","thing","physical","firm","this","somebody","nation","loss","rather","it","week","leader","make","bring","cost","might","apply","within","general","possible","love","people","out","me","idea","shot","year","join","try","area","realize","standard","admit","well","compare","level","pass","one","pain","cup","memory","successful","style","wrong","body","light","which","note","face","die","know","capital","defense","environment","bag","nor","car","season","member","something","write","focus","lie","sexual","expert","start","green","difficult","key","matter","television","field","remember","official","fish","worker","plant","hear","him","skin","may","piece","finger","institution","national","enter","welcomed","though","reason","however","owner","worry","threat","knowledge","community","performance","until","cut","born","move","thought","crime","candidate","total","question","current","fire","shake","relate","offer","model","name","budget","push","willing","western","all","range","figure","your","whom","social","now","cause","sport","who","southern","through","size","will","special","wish","sea","spend","private","really","daughter","certain","leg","several","hour","never","later","consider","moment","stuff","build","market","election","small","soon","today","whatever","hit","usually","final","wife","game","financial","yet","human","include","kitchen","skill","despite","around","increase","period","quickly","painting","particularly","consumer","lose","seat","development","ball","poor","identify","smile","paper","government","machine","town","evidence","night","seven","executive","keep","quite","front","education","religious","summer","fill","buy","generation","the","either","dark","head","throw","welcome","specific","stage","factor","agency","work","movie","person","appear","character","strategy","husband","four","box","she","again","short","trouble","way","oh","section","much","pretty","kill","be","argue","other","top","pattern","own","leave","patient","suggest","believe","choose","travel","goal","article","unit","share","teacher","working","follow","long","system","power","cold","hundred","message","list","third","sometimes","rich","mouth","career","sex","modern","every","free","decision","understand","about","remain","project","story","local","network","collection","can","bed","many","visit","last","their","experiencing","address","road","welcoming","whose","report","home","cover","why","behavior","second","bank","wondering","investment","two","past","player","anyone","girl","recognize","always","measure","even","month","truth","business","newspaper","interest","science","task","expect","media","become","require","feel","song","weapon","young","teach","under","while","movement","sell","better","billion","prove","reach","everyone","minute","south","already","both","describe","support","close","end","occur","history","eye","price","seem","provide","our","opportunity","problem","picture","alone","read","manage","subject","together","establish","sound","across","indicate","wide","response","arrive","use","medical","some","edge","participant","term","method","perform","shoulder","over","agreement","analysis","audience","continue","we","watch","save","like","laugh","forward","officer","to","fine","amount","account","best","catch","product","throughout","chair","glass","listen","bad","legal","anything","raise","three","those","speech","rate","into","help","environmental","step","almost","law","hotel","still","event","whole","role","family","treat","first","cultural","recent","tend","hot","benefit","exactly","grow","line","force","source","test","rock","lawyer"};

     //   new ShortestCompletingWord().shortestCompletingWord(licensePlate, words);
        //new ShortestCompletingWord().shortestCompletingWord(licensePlate1, words1);
        new ShortestCompletingWord().shortestCompletingWord(licensePlate2, words2);
    }

}
