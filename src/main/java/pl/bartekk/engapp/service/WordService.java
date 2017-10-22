package pl.bartekk.engapp.service;

import java.io.IOException;

public interface WordService {

    void insertNewWord(String fileName, String category) throws IOException;
}
