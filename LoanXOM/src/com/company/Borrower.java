package com.company;

public class Borrower {
    private String name;
    private int creditScore;
    private int yearlyIncome;

    public Borrower() {
    }

    public Borrower(String name, int creditScore, int yearlyIncome) {
        this.name = name;
        this.creditScore = creditScore;
        this.yearlyIncome = yearlyIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(int yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
}
