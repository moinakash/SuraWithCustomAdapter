package com.example.suracopy;

public class SuraLinePart {


    String sura_arbi;
    String sura_bangla;
    String sura_bangla_meaning;

    public SuraLinePart(String sura_arbi, String sura_bangla, String sura_bangla_meaning) {
        this.sura_arbi = sura_arbi;
        this.sura_bangla = sura_bangla;
        this.sura_bangla_meaning = sura_bangla_meaning;
    }

    public String getSura_arbi() {
        return sura_arbi;
    }

    public String getSura_bangla() {
        return sura_bangla;
    }

    public String getSura_bangla_meaning() {
        return sura_bangla_meaning;
    }
}
