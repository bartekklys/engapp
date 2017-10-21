package pl.bartekk.engapp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordRepository wordRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void insertNewWord(String fileName, String categoryName) throws IOException {

        File input = new File("/home/bartek/engapp/" + fileName + ".html");
        Document doc = Jsoup.parse(input, "UTF-8", "");

        Elements links = doc.select("div[class=wordbox]");

        Element pEnglishWord = null;

        Category category = new Category(categoryName);

        categoryRepository.save(category);
        for (Element link :
                links) {
            Word word = new Word();
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

            word.setPolish(polishWord.text());

            if (aEnglishWord != null) {
                word.setEnglish(aEnglishWord.text());
            } else {
                word.setEnglish(pEnglishWord.text());
            }

            word.setCategory(category);
            word.setLevel(Level.valueOf(className.substring(className.length() - 2).toUpperCase()));
            word.setDateAdded(new Date());
            word.setSoundUrl(href.text());

            wordRepository.save(word);
        }

    }
}
