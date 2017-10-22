package pl.bartekk.engapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.bartekk.engapp.persistance.Word;

public interface SearchService {

    Page<Word> findAll(Pageable pageable);

}
