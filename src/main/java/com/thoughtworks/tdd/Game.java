package com.thoughtworks.tdd;

public class Game {

    public String fizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (i % 7 == 0) {
            result += "Wizz";
        }
        if (result == null) {
            return String.valueOf(i);

        }
        return result;
    }


}
