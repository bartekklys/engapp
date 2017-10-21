package pl.bartekk.engapp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.bartekk.engapp.WordService;

import java.io.IOException;

@Controller
public class ParserController {

    @Autowired
    private WordService wordService;

    @GetMapping("/import/{fileName}/{category}")
    public String importWords(@PathVariable String fileName, @PathVariable String category) throws IOException {
        wordService.insertNewWord(fileName, category);
        return "";
    }
}
