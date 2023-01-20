package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        boolean[] alphabetList = new boolean[26];
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            } else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }
            alphabetList[index] = true;
        }

        for (int j = 0; j <= 25; j++) {
            if (alphabetList[j] == false) {
                return false;
            }
        }
        return true;
    }
}

