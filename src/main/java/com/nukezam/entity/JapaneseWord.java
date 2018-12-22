package com.nukezam.entity;

import org.springframework.stereotype.Component;

@Component
public class JapaneseWord {

    private int worldid;

    private int userid;

    private String wordname;

    private String wordKana;


    private String wordimi;
    private String tadoeba;

    public String getTadoeba() {
        return tadoeba;
    }

    public void setTadoeba(String tadoeba) {
        this.tadoeba = tadoeba;
    }

    public int getWorldid() {
        return worldid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public void setWorldid(int worldid) {
        this.worldid = worldid;
    }

    public String getWordname() {
        return wordname;
    }

    public void setWordname(String wordname) {
        this.wordname = wordname;
    }

    public String getWordKana() {
        return wordKana;
    }

    public void setWordKana(String wordKana) {
        this.wordKana = wordKana;
    }

    public String getWordimi() {
        return wordimi;
    }

    public void setWordimi(String wordimi) {
        this.wordimi = wordimi;
    }
}
