package pl.bartekk.engapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    private WordRepository wordRepository;

    @Override
    public Page<Word> findAll(Pageable pageable) {
        return wordRepository.findAll(pageable);

    }
}
