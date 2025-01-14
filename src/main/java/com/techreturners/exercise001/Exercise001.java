package com.techreturners.exercise001;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            return word;
        } else {
            return Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length());
        }
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double addedVat = (((originalPrice * vatRate / 100) + originalPrice));
        return Math.round(addedVat * 100.0) / 100.0;
    }

    public String reverse(String sentence) {
        StringBuffer sb = new StringBuffer(sentence);
        return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int numOfusers = 0;
        for (int i = 0; i <= users.size() - 1; i++) {
            if (users.get(i).getType().equals("Linux")) {
                numOfusers++;
            }
        }
        return numOfusers;
    }
}

