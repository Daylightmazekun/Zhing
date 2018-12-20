package com.nukezam.entity;

import org.springframework.stereotype.Component;

@Component
public class JapaneseWord {

    private int worldId;

    private int userId;

    private String wordName;

    private String wordKana;


    private String wordIMi;
    private String taDoEBa;

    public String getTaDoEBa() {
        return taDoEBa;
    }

    public void setTaDoEBa(String taDoEBa) {
        this.taDoEBa = taDoEBa;
    }

    public int getWorldId() {
        return worldId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setWorldId(int worldId) {
        this.worldId = worldId;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getWordKana() {
        return wordKana;
    }

    public void setWordKana(String wordKana) {
        this.wordKana = wordKana;
    }

    public String getWordIMi() {
        return wordIMi;
    }

    public void setWordIMi(String wordIMi) {
        this.wordIMi = wordIMi;
    }
}
