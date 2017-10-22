package pl.bartekk.engapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.bartekk.engapp.dao.WordRepository;
import pl.bartekk.engapp.persistance.Word;

@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    private WordRepository wordRepository;

    @Override
    public Page<Word> findAll(Pageable pageable) {
        return wordRepository.findAll(pageable);

    }
}
