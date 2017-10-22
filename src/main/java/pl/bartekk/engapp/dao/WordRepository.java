package pl.bartekk.engapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bartekk.engapp.persistance.Word;

public interface WordRepository extends JpaRepository<Word, Integer> {
}
