package com.company;

public class Klant {
    private String naam;
    private String voorletters;

    public String toString() {
        return voorletters==null ? naam : voorletters + " " + naam;
    }
    public void setNaam(String v, String n) {
        voorletters = v;
        naam = n;
    }
    public void setNaam(String n) {
        naam = n;
    }
}
