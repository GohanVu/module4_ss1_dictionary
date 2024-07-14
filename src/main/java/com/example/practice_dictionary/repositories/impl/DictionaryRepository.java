package com.example.practice_dictionary.repositories.impl;

import com.example.practice_dictionary.models.Word;
import com.example.practice_dictionary.repositories.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    static List<Word> wordList = new ArrayList<>();
    static {
        wordList.add(new Word("car","xe oto"));
        wordList.add(new Word("cat","meo"));
        wordList.add(new Word("dog","cho"));
        wordList.add(new Word("wtf", "ccjz"));
    }

    @Override
    public String checkUp(String englishWord) {
        for (int i = 0; i < wordList.size(); i++) {
            if(englishWord.equals(wordList.get(i).getEnglish())){
                return wordList.get(i).getVietnamese();
            }
        }
        return "Khong tim thay tu, vui long thu lai";
    }
}
