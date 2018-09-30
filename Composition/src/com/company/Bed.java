package com.company;

public class Bed {
    private String sytle;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String sytle, int pillows, int height, int sheets, int quilt) {
        this.sytle = sytle;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }
    public String getSytle() {
        return sytle;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
