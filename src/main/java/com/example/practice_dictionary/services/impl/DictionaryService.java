package com.example.practice_dictionary.services.impl;

import com.example.practice_dictionary.repositories.IDictionaryRepository;
import com.example.practice_dictionary.services.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    IDictionaryRepository dictionaryRepository;

    @Override
    public String checkUp(String englishWord) {
        return dictionaryRepository.checkUp(englishWord);
    }
}
