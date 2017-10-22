package pl.bartekk.engapp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchService {

    Page<Word> findAll(Pageable pageable);

}
