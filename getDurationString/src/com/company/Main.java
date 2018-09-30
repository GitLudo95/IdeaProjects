package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-45));
        System.out.println(getDurationString(65, 9));

    }

    private static String getDurationString(int Minutes, int Seconds) {

        if((Minutes <0) || (Seconds <0) || (Seconds >59)) {
            return INVALID_VALUE_MESSAGE;

        }

        int Hours = Minutes / 60;
        int remainingMinutes = Minutes % 60;

        String HoursString = Hours + "h";
        if(Hours <10) {
            HoursString = "0" + HoursString;
        }

        String MinutesString = remainingMinutes + "m";
        if(remainingMinutes <10) {
            MinutesString = "0" + MinutesString;
        }

        String SecondsString = Seconds + "s";
        if(Seconds <10) {
            SecondsString = "0" + SecondsString;
        }

        return HoursString + " " + MinutesString + " " + SecondsString + " ";

    }

    private static String getDurationString(int Seconds) {

        if(Seconds <0) {
            return INVALID_VALUE_MESSAGE;

        }

        int Minutes = Seconds / 60;
        int remainingSeconds = Seconds % 60;
        return getDurationString(Minutes, remainingSeconds);

    }
}

/*  Method: getDurationString
two parameters (of type int):
1. minutes (validate minutes is >=0)
2. seconds (validate seconds is >=0 and <=59)

Method should return String "Invalid value" if either of the above are false
Method should return String "XXh YYm ZZs" if above is true

Second Method: getDurationString
1. seconds (validate seconds is >=0)
return "Invalid value" if false
return amount of minutes if true

Tips:
- Use int or long for number data types
- 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds
- Methods should be static

Bonus:
- Input 61 minutes = 01h 01m 00s (tip: use if-else)

 */