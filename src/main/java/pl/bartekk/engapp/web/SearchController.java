package pl.bartekk.engapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bartekk.engapp.service.SearchService;
import pl.bartekk.engapp.persistance.Word;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping
    public String getHomePage(Pageable pageable, Model model) {
        Page<Word> words = searchService.findAll(pageable);
        model.addAttribute("words", words);
        return "search";
    }
}
