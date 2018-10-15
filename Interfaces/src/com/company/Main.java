package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone ludosPhone;
	    ludosPhone = new DeskPhone(123456);
	    ludosPhone.powerOn();
	    ludosPhone.callPhone(123456);
	    ludosPhone.answer();
    }
}
