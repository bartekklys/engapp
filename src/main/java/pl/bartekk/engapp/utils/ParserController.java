package pl.bartekk.engapp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bartekk.engapp.WordService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ParserController {

    @Autowired
    private WordService wordService;

    @GetMapping("/import")
    public String importWords() throws IOException, InterruptedException {
        Map<String, String> fileImport = new HashMap<>();
        fileImport.put("cechyCharakteru", "CECHY_CHARAKTERU");
        Thread.sleep(1000);
        fileImport.put("czlonkowieRodziny", "CZLONKOWIE_RODZINY");
        Thread.sleep(1000);
        fileImport.put("lotnisko", "LOTNISKO");
        Thread.sleep(1000);
        fileImport.put("owoce", "OWOCE");
        Thread.sleep(1000);
        fileImport.put("pogoda", "POGODA");
        Thread.sleep(1000);
        fileImport.put("pomieszeniaCzesciDomu", "POMIESZCZENIA_CZESCI_DOMU");
        Thread.sleep(1000);
        fileImport.put("przyprawyZiola", "PRZYPRAWY_ZIOLA");
        Thread.sleep(1000);
        fileImport.put("turystyka", "TURYSTYKA");
        Thread.sleep(1000);
        fileImport.put("warzywa", "WARZYWA");
        Thread.sleep(1000);
        fileImport.put("wyposazenieKuchni", "WYPOSAZENIE_KUCHNI");
        Thread.sleep(1000);
        fileImport.put("wyposazenieLazienki", "WYPOSAZENIE_LAZIENKI");

        for (String s :
                fileImport.keySet()) {
            wordService.insertNewWord(s, fileImport.get(s));
        }
        return "";
    }
}
