package pl.bartekk.engapp.utils;

public class DataParser {

    /*@Autowired
    private static WordRepository wordRepository;


    private static List<Word> slowka = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        File input = new File("/home/bartek/engapp/owoce.html");
        Document doc = Jsoup.parse(input, "UTF-8", "");

        Elements links = doc.select("div[class=wordbox]");

        Element pEnglishWord = null;
        for (Element link :
                links) {
            Element aEnglishWord = link.select("a").first();
            if (aEnglishWord == null) {
                pEnglishWord = link.select("p").first();
            }
            Element polishWord = link.select("em").first();
            Element href = link.select("a[href]").first();
            Element level = link.select("p[class]").first();

            String className = level.className();

            StringBuilder sb = new StringBuilder("");
            sb.append(polishWord.text());
            sb.append(";");
            if (aEnglishWord != null) {
                sb.append(aEnglishWord.text());
            } else {
                sb.append(pEnglishWord.text());
            }
            sb.append(";");
            if (href != null) {
                sb.append(href.attr("href"));
                sb.append(";");
            }
            sb.append(className.substring(className.length() - 2));
            sb.append(";family");
            System.out.println(sb.toString());

            Word word = new Word();
            word.setPolish(polishWord.text());

            if (aEnglishWord != null) {
                word.setEnglish(aEnglishWord.text());
            } else {
                word.setEnglish(pEnglishWord.text());
            }

            word.setCategory(new Category("OWOCE"));
            word.setLevel(Level.valueOf(className.substring(className.length() - 2).toUpperCase()));
            word.setDateAdded(new Date());

            wordRepository.save(word);
        }


    }*/
}
