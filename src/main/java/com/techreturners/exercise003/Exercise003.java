package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        int icecreamcode = 0;
        for (int i = 0; i <= iceCreamFlavours().length - 1; i++) {
            if (iceCreamFlavours()[i].equals(iceCreamFlavour)) {
                icecreamcode = i;
            }
        }
        return icecreamcode;
    }

    String[] iceCreamFlavours() {
        String[] iceCream = {"Pistachio", "Raspberry Ripple", "Vanilla",
                "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
        return iceCream;
    }

}


