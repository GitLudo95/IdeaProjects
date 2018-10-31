package com.company;

public class Adres {
    private String straatNaam;
    private String huisNummer;
    private String postCode;
    private String plaats;

    public Adres() {
        this.straatNaam = "";
        this.huisNummer = "";
        this.postCode = "";
        this.plaats = "";
    }

    public Adres(String straatNaam, String huisNummer, String postCode, String plaats) {
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.postCode = postCode;
        this.plaats = plaats;
    }

    public Adres(String straatNaam, String huisNummer, String plaats) {
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.plaats = plaats;
        this.postCode = "";
    }

    public Adres(String postCode, String huisNummer) {
        this.postCode = postCode;
        this.huisNummer = huisNummer;
        this.straatNaam = "";
        this.plaats = "";
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public void setHuisNummer(String huisNummer) {
        this.huisNummer = huisNummer;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String toString() {
        return straatNaam + " " + huisNummer + " " + "\n" + postCode + " " + plaats;
    }
}
